package dsa;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {64,25,12,22,11};

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        System.out.print("Ascending Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
            
        }
        System.out.println();



        for (int i = 0; i < arr.length-1; i++) {
            int maxIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.print("desending Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}
