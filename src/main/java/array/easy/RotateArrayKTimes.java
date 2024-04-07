package array.easy;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 */
public class RotateArrayKTimes {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int rotate = 3;
    System.out.println(
        "Arrays.toString(rotate(arr,roate)) = " + Arrays.toString(rotate(arr, rotate)));
    }

    private static int[] rotate(int [] arr , int K){
        if(arr.length == 0) return new int[0];
        K = K % arr.length;
    System.out.println("K = " + K);
        int [] ans = new int[arr.length];
        int j =0;
        for(int i = (arr.length-K)+1; i < arr.length ; i++) {
          ans[j] = arr[i];
          j++;
        }
        for(int i = 0; i < (arr.length -K)+1; i++) {
            ans[j] =arr[i];
            j++;
        }
        return ans;
    }
}
