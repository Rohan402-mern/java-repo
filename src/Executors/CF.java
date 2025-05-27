package Executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF {
   public static void main(String[] args) throws InterruptedException,ExecutionException {
    CompletableFuture<String> f1 = CompletableFuture.supplyAsync(()->{
      try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
        
      }
        return "Rohan1";
    });

    CompletableFuture<String> f2 = CompletableFuture.supplyAsync(()->{
      try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
        
      }
        return "Rohan2";
    }).thenApply((x)->x + " pandey");
    System.out.println(f2.get());
    System.out.println(f1.get());
   }
}
