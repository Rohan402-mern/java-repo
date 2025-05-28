package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Volatile {
    static volatile boolean flag = false;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable writer = () -> {
            try {
                Thread.sleep(1000);  // wait 1 second
            } catch (InterruptedException e) {
               
            }
            flag = true;
            System.out.println("Writer: flag set to true");
        };

        Runnable reader = () -> {
            System.out.println("Reader: Waiting for flag to become true...");
            while (!flag) {
                // Busy-waiting
            }
            System.out.println("Reader: Detected flag is true!");
        };

        executor.submit(reader);
        executor.submit(writer);

        executor.shutdown();
    }
}
