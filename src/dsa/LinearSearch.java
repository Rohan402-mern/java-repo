package dsa;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
     try (   Scanner sc = new Scanner(System.in);) {
        System.out.print("Enter a number to find:");
        int num = sc.nextInt();
        int[] arr = {10,20,30,40,50};
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.println("Number found at index no:" + i);
                found = true;
                break;
            }
           
        }
        if(!found){
            System.out.println("Oops number not found!");
        }
     } catch (Exception e) {

     }
        
    }
}
