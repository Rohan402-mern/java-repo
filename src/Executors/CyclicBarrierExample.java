package Executors;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierExample {
    public static void main(String[] args) throws InterruptedException {
        int personcount = 3;
        CyclicBarrier barrier = new CyclicBarrier(personcount,()->{
            System.out.println("All persons arrived at the threater");
        });
        ExecutorService executor = Executors.newFixedThreadPool(personcount);
        executor.submit(new Person("person-1", barrier,2000));
        executor.submit(new Person("person-2", barrier,500));
        executor.submit(new Person("person-3", barrier,1500));

        executor.shutdown();
       try {
        if(!executor.awaitTermination(5,TimeUnit.SECONDS )){
        System.out.println("Some task did not finshed in time!");
        }
       } catch (InterruptedException e) {
        System.out.println("Main thread was interrupted!");
       }

       Thread.sleep(1000);
       System.out.println("All done.");

    }
}

class Person implements Runnable{
    private final String name;
    private final CyclicBarrier barrier;
    private final int time;

    public Person(String name,CyclicBarrier barrier,int time){
        this.name = name;
        this.barrier = barrier;
        this.time = time;
    }


    @Override
    public void run(){
        try {
            System.out.println(name + " is on his way to theater");
            Thread.sleep(time);
            System.out.println(name + " has arrived at the meeting point");
            barrier.await();
            System.out.println(name + " is entering the theater.");
        } catch (InterruptedException | BrokenBarrierException e) {
          System.out.println(name + " could not wait and left");
        }
    }
}
