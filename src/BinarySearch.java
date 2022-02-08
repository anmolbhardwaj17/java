import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    //here array should be sorted
    //STEPS:
    //Find middle element
    //if no. is greater than middle no choose right side array and vice-versa
    //if middle element is my target then that is the answer
    //worst case time complexity log2(N)

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,22,33,44,55,67,89,99,100};
        System.out.println(bs(arr,67));

    }
    //return the index
    static int bs(int[] arr, int n){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(n<arr[mid]){
                end = mid-1;
            } else if(n > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;

    }
}
