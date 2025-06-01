package Collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWrite {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Milk");
        list.add("Eggs");
        list.add("Bread");
        for (String item : list) {
            System.out.println(item);
            if(item.equals("Eggs")){
                list.add("Butter");
                System.out.println("Added Butter while reading.");
            }
        }
        System.out.println("Updated shoppinglist: " + list);
    }
}
