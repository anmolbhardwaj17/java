import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,4,56,5};
        System.out.println(Arrays.toString(arr));
        //swap(arr,1,3);
        //System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
    static int max(int[] arr){
        int max = 0;
        for(int a: arr){
            if(a>max){
                max = a;
            }
        }
        return max;
    }
    static void reverse(int[] arr){
        int start = 0;
        int end =  arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
