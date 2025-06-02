package Collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Rohan",25);
        hashMap.put("Ritik",21);
        hashMap.put("Mukesh",211);
        System.out.println(hashMap.get("Rohan"));

        
    }
}
