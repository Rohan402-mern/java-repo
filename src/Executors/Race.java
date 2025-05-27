package Executors;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Race {
    public static void main(String[] args) throws InterruptedException {
        int numRunners = 5;

        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSignal = new CountDownLatch(numRunners);

        ExecutorService executor = Executors.newFixedThreadPool(numRunners);
        for (int i = 1; i <=numRunners; i++) {
            executor.submit(new Runner(startSignal, doneSignal, "runner-" + i));
        }
        System.out.println("Get ready...");
        Thread.sleep(1000);
        System.out.println("Set...");
        Thread.sleep(1000);
        System.out.println("Go...");
        startSignal.countDown();
        doneSignal.await();
        System.out.println("All runners have finshed!");
        executor.shutdown();

    }
}

class Runner implements Runnable {
    private final CountDownLatch startSignal;
    private final CountDownLatch doneSignal;
    private final String name;

    public Runner(CountDownLatch startSignal, CountDownLatch doneSignal, String name) {
        this.startSignal = startSignal;
        this.doneSignal = doneSignal;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            startSignal.await();
            System.out.println(name + " starting the race.");
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println(name + " finshed the race");
        } catch (InterruptedException e) {
            System.out.println(name + " was interruppted!");
        }finally{
            doneSignal.countDown();
        }
    }
}
