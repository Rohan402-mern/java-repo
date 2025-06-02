package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapdemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkMap = new LinkedHashMap<>(11,0.3f,true);
        linkMap.put("Rohan",12);
        linkMap.put("Ritik",1);
        linkMap.put("Rahul",211);
        

        for (Map.Entry<String, Integer> entry : linkMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
