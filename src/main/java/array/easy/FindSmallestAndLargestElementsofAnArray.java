package array.easy;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 */
public class FindSmallestAndLargestElementsofAnArray {
    public static void main(String[] args){
        int [] arr = {1,2,4,5,1,7,1,2};
        int [] ans = findSmallestAndLargestElementsOfAnArray(arr);
    System.out.println("Arrays.toString(ans) = " + Arrays.toString(ans));
    }

    private static int[] findSmallestAndLargestElementsOfAnArray(int [] arr){
        Arrays.sort(arr);
        int [] ans = new int[2];
        ans[0] = arr[0];
        ans[1] = arr[arr.length-1];
        return ans;
    }

}
