package array.easy;

import java.util.*;

/**
 * Find Kth highest and lowest element of an array
 * I/P = > {1,2,4,5,7,9,12}
 * K => 2
 * Lowest => 2 , Highest => 9
 * @author Tanmoy Mukherjee
 */
public class FindKthSmallestAndLargestElementsOfAnArray {
    public static void main(String[] args){
        int [] arr = {1,2,4,5,1,4,7,9,12,9};
        int K = 2;
        int [] ans = findKthSmallestAndLargestElementsOfAnArray(arr,K);
        System.out.println("Arrays.toString(ans) = " + Arrays.toString(ans));
    }

    private static int[] findKthSmallestAndLargestElementsOfAnArray(int [] arr , int K){
        Arrays.sort(arr);
        int [] dupRemoved = removeDuplicates(arr);
        int [] ans = new int[2];
        ans[0] = dupRemoved[K-1];
        ans[1] = dupRemoved[(dupRemoved.length-1)-(K-1)];
        return ans;
    }

    /*private static int[] removeDuplicates(int [] arr){
    Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
                set.add(arr[i]);
            }
       return set.stream().mapToInt(Integer::intValue).toArray();
    }*/

    private static int[] removeDuplicates(int [] arr){
       return Arrays.stream(arr).distinct().toArray();
    }
}


