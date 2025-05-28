package dsa;

public class StudScore {
    public static void main(String[] args) {
        int[] arr = {60,90,50,40,75,65,55,95};

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

          System.out.print("top Three scores are:");
        for(int i=0; i<arr.length; i++){
            if(i<3){
              
                 System.out.print(arr[i] + " ");
            }
        }

    }
}
