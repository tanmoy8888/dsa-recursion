package array.leet_code.medium;

import java.util.Arrays;

/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 *
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums is a non-decreasing array.
 * -109 <= target <= 109
 * @author Tanmoy Mukherjee
 */
public class FindFirstAndLastPositionOfSortedArray {

     public static void main(String[] args){
      int [] nums ={5,7,7,8,8,10};
       //  int [] nums ={1};
      //int target =1;
      int target =8;
    System.out.println("searchRange(nums,target) = " + Arrays.toString(searchRange(nums, target)));
  }
    public static int[] searchRange(int[] nums, int target) {
        int startIndex =-1;
        int endIndex =-1;
        if(nums.length == 0) return new int[]{startIndex,endIndex};
        int start =0;
        int end =nums.length-1;
        int [] ans = new int[2];
        while (end >= start){
                if(nums[start] == target){
                    startIndex = start;
                }
                if(nums[end] == target){
                    endIndex = end;
                }
                if(startIndex == -1){
                    start++;
                }
                if(endIndex == -1){
                     end--;
                }
                if(startIndex != -1 && endIndex != -1){
                    break;
                }
        }
        ans[0]=startIndex;
        ans[1]=endIndex;
        return ans;
    }
}
