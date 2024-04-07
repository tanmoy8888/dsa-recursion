package array.easy;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 */
public class RotateArrayKTimesWithoutExtraSpace {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7};
        int K = 5;
    System.out.println("Arrays.toString(rotate(arr,K)) = " + Arrays.toString(rotate(arr, K)));
    }

    private static int[] rotate(int[] arr , int K){
        if(arr.length == 0) return new int[0];
        K = K % arr.length;
        int n = arr.length;
        rotateHelper(arr,0, (n-K)-1);
        rotateHelper(arr,(n-K),n-1);
        rotateHelper(arr,0,n-1);
        return arr;
    }

    private static void rotateHelper(int[] arr , int start , int end){
        if(arr.length == 0) return;
        int temp;
        while (end > start){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}
