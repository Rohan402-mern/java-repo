package Executors;
import java.util.concurrent.*;

public class MovieDownloaderWithExecutor {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        String[] movies = {"Inception", "Avatar", "Titanic", "Interstellar", "Matrix"};
        Future<String>[] futures = new Future[5];

        long start = System.currentTimeMillis();

        for (int i = 0; i < movies.length; i++) {
            final String movie = movies[i];
            futures[i] = executor.submit(() -> {
                System.out.println("Downloading " + movie + " by " + Thread.currentThread().getName());
                
                return "Downloaded: " + movie;
            });
        }

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();

        long end = System.currentTimeMillis();
        System.out.println("Total time (ExecutorService): " + (end - start) + " ms");
    }
}
