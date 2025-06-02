package Collections;

import java.util.*;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<Object, String> weakMap = new WeakHashMap<>();

        Object key = new Object();
        weakMap.put(key, "Hello, world!");

        System.out.println("Before GC: " + weakMap);

        // key = null;

        System.gc();
        Thread.sleep(1000);

        System.out.println("After GC: " + weakMap);
    }
}
