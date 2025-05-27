package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Await {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 9; i++) {
            int finall  = i;
            executor.submit(()->{
                // try {
                //     Thread.sleep(2000);
                // } catch (InterruptedException e) {
                    
                // }
                System.out.println("finishing task " + finall + " with " + Thread.currentThread().getName() );
            });
        }
        executor.shutdown();
        while (!executor.awaitTermination(1,TimeUnit.MILLISECONDS)) {
            System.out.println("completing previous tasks...");
        }
        System.out.println("All done");
    }
    
}
