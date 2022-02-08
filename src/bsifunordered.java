import java.util.Arrays;
import java.util.Scanner;

public class bsifunordered {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,22,33,44,55,67,89,99,100};
        System.out.println(bs(arr,67));
    }
    static int bs(int[] arr, int n){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc; //to check if array is ascending or decending
        if(arr[start]<arr[end]){
            isAsc = true;
        } else{
            isAsc = false;
        }

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == n){
                return mid;
            }

            if (isAsc) {
                if(n<arr[mid]){
                    end = mid-1;
                } else{
                    start = mid + 1;
                }
            }else{
                if(n > arr[mid]){
                    end = mid-1;
                } else{
                    start = mid + 1;
                }
            }


        }
        return -1;
    }
}
