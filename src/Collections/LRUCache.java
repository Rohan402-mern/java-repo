package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private final int capacity;
    public static void main(String[] args) {
        LRUCache<String,Integer> lru = new LRUCache<>(3);
        lru.put("Rohan",45);
        lru.put("Ritik",95);
        lru.put("Rahul",65);
        lru.put("Raj", 85);
        
        System.out.println(lru);

    }

    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size() > capacity;
    }

}
