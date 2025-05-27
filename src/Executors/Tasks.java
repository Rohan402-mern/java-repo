package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tasks {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        Future<?> future = executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            try {
                System.out.println(threadName + ": Task started, going to sleep for 5 seconds...");
                Thread.sleep(5000);
                System.out.println(threadName + ": Task completed normally.");
            } catch (InterruptedException e) {
                System.out.println(threadName + ": Task was interrupted!");
                Thread.currentThread().interrupt(); // Preserve interrupt status
            }

            return "This won't be returned if task is cancelled";
        });

        try {
            Thread.sleep(2000); // Wait 2 seconds before cancelling
        } catch (InterruptedException e) {
            System.out.println("Main thread exception occured " + e);
        }

        System.out.println("Main: Attempting to cancel task...");
        future.cancel(true);

        if (future.isCancelled()) {
            System.out.println("Main: Task was successfully cancelled.");
        }

        executor.shutdown();
        System.out.println("Main: All done.");
    }
}
