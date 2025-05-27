package Executors;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountdownLatchExample{
    public static void main(String[] args) throws InterruptedException {
        int workercount = 3;
        CountDownLatch latch = new CountDownLatch(workercount);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <=workercount; i++) {
         executor.submit(new Worker(latch, "Worker " + i));
        }

        System.out.println("Main thread waiting for workers to finish...");
        latch.await();
        
        System.out.println("✅ All worker tasks completed. Main thread proceeding.");

        executor.shutdown();
    }
}

class Worker implements Runnable{
    private final CountDownLatch latch;
    private final String name;
    

    public Worker(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run(){

        try {
            System.out.println("🔧 " + name + " started work.");
            Thread.sleep((int) (Math.random() * 3000) + 1000);  // Simulate work
            System.out.println("✅ " + name + " completed work.");
        } catch (InterruptedException e) {
            System.out.println("❌ " + name + " interrupted.");
        } finally {
            latch.countDown();
        }

    }



}
