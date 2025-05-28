package dsa;

public class Dsa {
    public static void main(String[] args) {
        String[] arr = {"rohan","ritik","yash","samarth"};
        int count = 0;
        for (String arr1 : arr) {
            if (arr1.startsWith("r")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
