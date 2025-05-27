package Executors;

import java.util.concurrent.*;

public class UrlDownloaderWithoutList {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();
        String[] urls = {
            "https://example.com/1",
            "https://example.com/2",
            "https://example.com/3",
            "https://example.com/4",
            "https://example.com/5"
        };

        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit all tasks first (to achieve parallelism)
        Future<String> f1 = executor.submit(() -> download(urls[0]));
        Future<String> f2 = executor.submit(() -> download(urls[1]));
        Future<String> f3 = executor.submit(() -> download(urls[2]));
        Future<String> f4 = executor.submit(() -> download(urls[3]));
        Future<String> f5 = executor.submit(() -> download(urls[4]));

        // Retrieve and print results
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
        System.out.println(f5.get());

        executor.shutdown();
        try {
            executor.awaitTermination(11,TimeUnit.SECONDS);
        }catch(InterruptedException e){
            System.out.println("Exception occured " + e);
        }
        System.out.println("time taken " + (System.currentTimeMillis() - startTime));
    }

    static String download(String url) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " started downloading: " + url);
        Thread.sleep(2000); // Simulate download time
        return "Downloaded: " + url;
    }
}
