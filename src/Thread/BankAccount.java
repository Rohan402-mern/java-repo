package Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public  void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attemting to withdraw " + amount);
        try {
            if(lock.tryLock(1000,TimeUnit.MILLISECONDS)){
                if(balance>=amount){
            try {
                 System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                 Thread.sleep(3000);
                 balance-=amount;
                 System.out.println(Thread.currentThread().getName() + " Completed withdrawal. Remaining balance: " + balance);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            finally{
                lock.unlock();
            }
    }
        else{
            System.out.println(Thread.currentThread().getName() + " insufficent withdrawal");
        }   
        }
        else{
            System.out.println(Thread.currentThread().getName() + " could not aquire the lock, will try later");
        }
        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        }
        
    }

}
