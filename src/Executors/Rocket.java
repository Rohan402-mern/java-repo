package Executors;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Rocket {
    public static void main(String[] args) throws InterruptedException {
        int numsystem = 3;
        CountDownLatch latch = new CountDownLatch(numsystem);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(new PrepareRocket(latch, "fueling",1000));
        executor.submit(new PrepareRocket(latch, "Navigation",1500));
        executor.submit(new PrepareRocket(latch, "Engine Checking",2000));

        latch.await();
        executor.shutdown();
        System.out.println("Launch!");
    }
}

class PrepareRocket implements Runnable{
    private final CountDownLatch latch;
    private final String systemName;
    private final int time;
    public PrepareRocket(CountDownLatch latch,String systemName,int time){
        this.latch = latch;
        this.systemName = systemName;
        this.time = time;
    }

    @Override
    public void run(){
        try {
            System.out.println(systemName + " is intializing");
            Thread.sleep(time);
            System.out.println(systemName + " completed!");
        } catch (InterruptedException e) {
            System.out.println(systemName + " execution failed!");
        }finally{
            latch.countDown();
        }
    }
}
