import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        int[] arr ={1,3,2,5,8,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length -i-1;
            int maxIndex = getmax(arr,0,last);
            swap(arr, maxIndex,last);

        }
    }
    private static int getmax(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j< arr.length-i;j++){
                //swap if item is smaller than previous
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
