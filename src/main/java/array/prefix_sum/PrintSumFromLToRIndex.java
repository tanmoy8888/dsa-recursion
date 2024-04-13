package array.prefix_sum;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 */
public class PrintSumFromLToRIndex {
    public static void main(String[] args){
     int [] arr = {1,2,3,4,5};
     int l = 1;
     int r = 5;
    System.out.println(
        "Arrays.toString(findSum(arr,l,r)) = " + findSum(arr, l, r));
    }

    private static int findSum(int [] arr , int l , int r){
         int [] prefixSumArray = prefixSumArray(arr);
    System.out.println("Arrays.toString(prefixSumArray) = " + Arrays.toString(prefixSumArray));
         return prefixSumArray[r]-prefixSumArray[l-1];
    }

    private static int[] prefixSumArray(int [] arr){
        for(int i = 1; i < arr.length; i++) {
          arr[i] += arr[i-1];
      System.out.println("arr[i] = " + arr[i]); 
        }
        return arr;
    }

}
