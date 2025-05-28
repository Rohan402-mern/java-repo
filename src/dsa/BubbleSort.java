package dsa;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,2,7,4,1};
        int temp = 0;
         int swap = 0;
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }

            }
            
        }
        System.out.println(swap +  " " + temp);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}
