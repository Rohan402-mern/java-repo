package Executors;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Services {
    public static void main(String[] args) throws InterruptedException {
        int numservice = 3;
        CountDownLatch latch = new CountDownLatch(numservice);
        ExecutorService executor = Executors.newFixedThreadPool(3);

            executor.submit(new ProcessService("Database",2000,latch));
            executor.submit(new ProcessService("Cache",1500,latch));
            executor.submit(new ProcessService("Config",1000,latch));
        

         latch.await(); 
        System.out.println("✅ All services initialized. Starting main application.");

        executor.shutdown();
    }

}

class ProcessService implements Runnable{
    private final String serviceName;
    private final int time;
    private final CountDownLatch latch;

    public ProcessService(String serviceName,int time,CountDownLatch latch){
        this.serviceName = serviceName;
        this.time = time;
        this.latch = latch;
    }

    @Override
    public void run(){
        try {
            System.out.println(serviceName + " intialization started...");
        Thread.sleep(time);
        System.out.println(serviceName + " is ready");
        } catch (InterruptedException e) {
            System.out.println(serviceName + " failed to initalize.");
        }finally{
            latch.countDown();
        }
    }
}
