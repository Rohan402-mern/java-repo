package Executors;
import java.util.concurrent.*;
import java.util.*;

public class SquareCalculatorWithResults {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int[] numbers = {2, 4, 6, 8, 10};

        // Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // List to store Future results
        List<Future<Integer>> results = new ArrayList<>();

        // Submit a Callable task for each number
        for (int num : numbers) {
            Callable<Integer> task = () -> {
                int square = num * num;
                System.out.println(Thread.currentThread().getName() + " is squaring " + num + " = " + square);
                return square;
            };

            Future<Integer> future = executor.submit(task);
            results.add(future);
        }

        // Get and print all results
        System.out.println("\nFinal Results:");
        for (int i = 0; i < results.size(); i++) {
            int square = results.get(i).get(); // blocks until result is ready
            System.out.println("Square of " + numbers[i] + " is: " + square);
        }

        executor.shutdown();
    }
}

