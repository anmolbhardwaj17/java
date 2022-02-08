import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] l = {1,2,3,4,5};
        reverseArray(l);
        System.out.println(Arrays.toString(l));
    }

    static int ans(int n){
        return (int)(Math.log10(n)) + 1;
    };
    static void reverseArray(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start <= end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

    };

};

