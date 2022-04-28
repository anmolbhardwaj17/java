import java.util.*;
import java.util.Scanner;

public class array {
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int[] rnos = new int[5];
//        int[] rnos2 = {23,12,45,32,15};
//        int[] arr = new int[5];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//       for (int j : arr) {
//           System.out.println(j + " ");
//        }
//        System.out.println(Arrays.toString(arr));

//        String[] a = new String[4];
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = in.next();
//        }
//
//        System.out.println(Arrays.toString(a));

//            int[] nums = {3,4,5,12};
//        System.out.println(Arrays.toString(nums));
//        change(nums);
//        System.out.println(Arrays.toString(nums));

//        int[] nums = {-3, -1, -1, -1, -2, -2};
//
//        int[] list = new int[100000];
//        for(int i=0;i<nums.length;i++){
//            int occur = list[nums[i]]+1;
//            list[nums[i]] =  occur;
//        }
//        for(int j=0;j<list.length;j++){
//            for(int k=0;k<list.length;k++){
//                if(list[j] == list[k] && list[j]>0 && list[k]>0){
//                    System.out.println("false");
//                }
//            }
//        }
//        String s = "1";
//        System.out.println(s.charAt(0));
        //System.out.println("true");

        int[] mapping = {8, 9, 4, 0, 2, 1, 3, 5, 7, 6};
        int[] nums = {991,338,38}  ;

        for(int i=0;i<nums.length;i++){
            String s = "";
            while(nums[i]!=0){
                int r = nums[i]%10;
                s = mapping[r]+ s;
                nums[i] = nums[i]/10;

            }
            nums[i] = Integer.parseInt(s);
            System.out.println(nums[i]);
        }




    }
//    static int[] sortJumbled(int[] mapping, int[] nums) {
//        for(int i=0;i<nums.length;i++){
//            String s;
//            while(nums[i]!=0){
//                int r = nums[i]%10;
//                s = mapping[r]+ s;
//                nums[i] = nums[i]/10;
//
//            }
//            nums[i] = Integer.parseInt(s);
//        }
//        return Arrays.sort(nums);
//
//    }
}
