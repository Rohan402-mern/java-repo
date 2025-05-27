package Executors;

import java.util.concurrent.*;

public class ServiceInitializer {
    public static void main(String[] args) throws InterruptedException {
        int numberOfServices = 3;
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(new Service("Database", 2000, latch));
        executor.submit(new Service("Cache", 1500, latch));
        executor.submit(new Service("Config", 1000, latch));

        // Main thread waits for all services to complete
        latch.await(); 
        System.out.println("✅ All services initialized. Starting main application.");

        executor.shutdown();
    }
}

class Service implements Runnable {
    private final String serviceName;
    private final int initTime; // milliseconds
    private final CountDownLatch latch;

    public Service(String serviceName, int initTime, CountDownLatch latch) {
        this.serviceName = serviceName;
        this.initTime = initTime;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println("🔄 " + serviceName + " initialization started...");
            Thread.sleep(initTime);
            System.out.println("✅ " + serviceName + " is ready.");
        } catch (InterruptedException e) {
            System.out.println("❌ " + serviceName + " failed to initialize.");
        } finally {
            latch.countDown(); // Notify latch that this service is done
        }
    }
}


