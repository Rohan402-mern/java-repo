package Thread;

public class CoffeeShop {
    private boolean coffeeReady = false;

    // Customer waits for coffee
    public synchronized void waitForCoffee() throws InterruptedException {
        while (!coffeeReady) {
            System.out.println(Thread.currentThread().getName() + ": Waiting for coffee...");
            wait();  // releases lock and waits
        }
        System.out.println(Thread.currentThread().getName() + ": Got my coffee! ☕");
    }

    // Barista makes coffee and notifies customer
    public synchronized void makeCoffee() {
        System.out.println(Thread.currentThread().getName() + ": Making coffee...");
        // try {
        //     Thread.sleep(2000);  // simulate time to make coffee
        // } catch (InterruptedException e) {
        //     Thread.currentThread().interrupt();
        // }
        coffeeReady = true;
        System.out.println(Thread.currentThread().getName() + ": Coffee is ready!");
        notify();  // notify waiting customer
    }
}