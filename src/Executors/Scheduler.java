package Executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler{
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(()-> System.out.println("Remainder after every 3 seconds"),0,3,TimeUnit.SECONDS);
        
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
        }

        scheduler.shutdown(); // Graceful shutdown
        System.out.println("Scheduler has been shut down.");

    }
    
}