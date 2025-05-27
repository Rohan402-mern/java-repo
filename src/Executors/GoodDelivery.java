package Executors;

public class GoodDelivery implements Runnable {
    private final String order;

    public GoodDelivery(String order){
        this.order = order;
    }

    @Override
    public void run(){
        System.out.println("Delivering: " + order + " by " + Thread.currentThread().getName());
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("Delivered: " + order);
    }

}
