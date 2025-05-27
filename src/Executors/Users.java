package Executors;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Users {
    public static void main(String[] args) throws InterruptedException {
        int numplayers = 4;
        CountDownLatch latch = new CountDownLatch(numplayers);
        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit(new StartGame(latch,"player-1",1500));
        executor.submit(new StartGame(latch,"player-2",2500));
        executor.submit(new StartGame(latch,"player-3",2000));
        executor.submit(new StartGame(latch,"player-4",1000));

        latch.await();
        
        System.out.println("Game is starting!");
        executor.shutdown();
    }
}

class StartGame implements Runnable{
    private final CountDownLatch latch;
    private final String player;
    private final int time;

    public StartGame(CountDownLatch latch,String player,int time){
        this.latch = latch;
        this.player = player;
        this.time = time;
    }

    @Override
    public void run(){
        try {
            System.out.println(player + " is joining...");
            Thread.sleep(time);
            System.out.println(player + " joined the game.");
             System.out.println(latch.getCount());
        } catch (InterruptedException e) {
            System.out.println(player + " failed to join!");
        }finally{
            latch.countDown();
        }
    }
}
