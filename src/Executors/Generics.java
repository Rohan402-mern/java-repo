package Executors;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
    //    int[] arr = new int[5];
       ArrayList<String> list = new ArrayList<>();
       list.add("123");
       list.add("Hello");
       list.add("3.14");

      String s = list.get(1);
      String a = list.get(0);

      System.out.println(list);
      System.out.println(s);
      System.out.println(a);
    }
}
