package array.easy;

import java.util.Arrays;

/**
 * Find Kth highest and lowest element of an array
 * I/P = > {1,2,4,5,7,9,12}
 * K => 2
 * Lowest => 2 , Highest => 9
 * @author Tanmoy Mukherjee
 */
public class FindKthSmallestAndLargestElementsofAnArray {
    public static void main(String[] args){
        int [] arr = {1,2,4,5,7,9,12};
        int K = 2;
        int [] ans = findKthSmallestAndLargestElementsOfAnArray(arr,K);
        System.out.println("Arrays.toString(ans) = " + Arrays.toString(ans));
    }

    private static int[] findKthSmallestAndLargestElementsOfAnArray(int [] arr , int K){
        Arrays.sort(arr);
        int [] ans = new int[2];
        ans[0] = arr[K-1];
        ans[1] = arr[(arr.length-1)-(K-1)];
        return ans;
    }
}


