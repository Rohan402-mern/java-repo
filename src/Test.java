import Thread.ReadWrite;


public class Test{
    public static void main(String[] args) {

        ReadWrite counter = new ReadWrite();

        Runnable readTask= () ->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " read:" + counter.getCount());
            }
        };

        Runnable writeTask= () ->{
            for (int i = 0; i < 10; i++) {
                counter.increment();
                System.out.println(Thread.currentThread().getName() + " incremented");
            }
        };

        Thread t1 = new Thread(readTask, "t1");
        Thread t2 = new Thread(readTask, "t2");
        Thread t5 = new Thread(readTask, "t5");
        Thread t3 = new Thread(readTask, "t3");
        Thread t4 = new Thread(writeTask, "t4");

        t1.start();
        t2.start();
        t5.start();
        t3.start();
        t4.start();
        

    }
}    