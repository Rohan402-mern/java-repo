package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Play {
    private final Lock lock = new ReentrantLock(true);

    public void accessResource(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally{
            System.out.println(Thread.currentThread().getName() + " released the lock");
            lock.unlock();
        }
    }
}
