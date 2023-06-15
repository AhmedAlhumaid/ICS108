import java.util.*;
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[100000];
        int key = 0;
        for(int i = 0 ; i<100000;i++){ //inserting numbers in the array
            arr[i] = i;
        }

        long startTime =System.nanoTime();
        for(int i = 0; i<1000000;i++){
            LinearSearch(arr,i);
        }
        long endTime = System.nanoTime();
        long executionTime = endTime-startTime;
        System.out.println("time in linear search method = " + executionTime+" ns");
        //for binary search
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int low = 0;
            int high = arr.length - 1;
            key = i;
            if(i<arr.length){
            while (low <= high) {
                int mid = (low + high) / 2;
                if (key == arr[mid]) {
                    // found the target value, do something
                    break;
                } else if (key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }}

        }
        endTime = System.nanoTime();
        executionTime = endTime-startTime;
        System.out.println("time in binary search method = " + executionTime+" ns");
    }
    public static int LinearSearch(int[]arr, int key){
            for(int i =0;i<arr.length;i++){
                if(key == arr[i]){
                    return i;
                }
            }
            return -1;
    }
}