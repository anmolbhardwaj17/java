import java.util.Arrays;
import java.util.Scanner;

public class multidimenison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][4]; //columns declaration is not necessary
        int[][] b = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = in.nextInt();
            }
        };

        for(int[] a: arr){  //advanced for loop
            System.out.println(Arrays.toString(a));
        }
    }
}
