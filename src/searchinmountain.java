//leetcode 1095

public class searchinmountain {
    public static void main(String[] args) {

    }
    int search(int[] arr,int target){
        int peak = bs(arr);
        int firsttry = obs(arr, target,0,peak);
        if(firsttry != -1){
            return firsttry;
        }
        return obs(arr,target,peak+1, arr.length-1);
    }

    public int bs(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int obs(int[] arr, int n, int start, int end){


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
