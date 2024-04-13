package array.prefix_sum;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 */
public class PrintSumFromLToRIndex {
    public static void main(String[] args){
     int [] arr = {1,2,3,4,5};
     int l = 0;
     int r = 5;
    System.out.println(
        "Arrays.toString(findSum(arr,l,r)) = " + findSum(arr, l, r));
    }

    private static int findSum(int [] arr , int l , int r){
         int [] prefixSumArray = prefixSumArray(arr);
        int left=0;
         if(l < 1){
            left =l+1;
         }
         int right = r-1;

    System.out.println("prefixSumArray[right] = " + prefixSumArray[right]);
    System.out.println("prefixSumArray[left - 1] = " + prefixSumArray[left - 1]);

    return prefixSumArray[right] - prefixSumArray[left - 1];
    }

    private static int[] prefixSumArray(int [] arr){
        for(int i = 1; i < arr.length; i++) {
          arr[i] += arr[i-1];
      System.out.println("arr[i] = " + arr[i]);
        }
        return arr;
    }

}
