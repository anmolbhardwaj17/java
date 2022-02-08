import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5,6,7,8,9,10,5433,6534,47,54,45,34,56,7,99};
        //System.out.println(linear(arr,5433));
//        String name = "Anmol";
//        char n = 'x';
//        System.out.println(searchString(name, n));
//        System.out.println(Arrays.toString(name.toCharArray()));
        //System.out.println(linearRange(arr, 56, 5, 15));
//        int n = 153;
//        int digits = (int)(Math.log10(n)) + 1;
//        int ans = 0;
//        while (n != 0){
//            int last = n%10;
//            ans += Math.pow(last, digits);
//            n = n/10;
//        }
        int x = 1;
        int y = 1;
        String[] moves = {"WEST", "EAST"};
        int xans = 0;
        int yans = 0;
        for(int i = 0;i<moves.length;i++){
            if(moves[i] == "NORTH"){
                yans++;
            }
            if(moves[i] == "SOUTH"){
                yans--;
            }
            if(moves[i] == "WEST"){
                xans--;
            }
            if(moves[i] == "EAST"){
                xans++;
            }
        }
        if(x == xans && y == yans){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }



    }
    static int linear(int[] arr, int n){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element == n){
                return i;
            }
        }
        return -1;
    };
    static boolean searchString(String str, char n){
        if(str.length() == 0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(n == str.charAt(i)){
                return true;
            }
        }
        return false;
    };
    static int linearRange(int[] arr, int n, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i=start;i<=end;i++){
            int element = arr[i];
            if(element == n){
                return i;
            }
        }
        return -1;
    };

    static boolean even(int num){
        int count=0;
        while(num >0){
            count++;
            num = num/10;

        }
        if(count%2 == 0){
            return true;
        }
        return false;

    }
    static int noofdigits(int n){
        return (int)(Math.log10(n)) + 1;
    }
}
