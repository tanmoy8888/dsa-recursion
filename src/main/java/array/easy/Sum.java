package array.easy;

import java.util.Arrays;

/**
 * Problem Statement
 * Return the indices of the two numbers so that they add up to target given an array of integers nums and an integer target.
 *
 * You can make an assumption that every input has exactly one solution, and you may avoid using the same element more than once.
 *
 * Note: Return the answer in sorted order.
 *
 * Example 1:
 * Input:
 * nums = [1,2,3,4,5]
 * target = 8
 * Output:
 * [2,4]
 * Explanation:
 * Because nums[2] + nums[4] == 8, we return [2, 4].
 * Example 2:
 * Input:
 * nums = [1,2,3,4,5]
 * target = 3
 * Output:
 * [0,1]
 *
 * Constraints:
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 * @author Tanmoy Mukherjee
 */
public class Sum {
    public static void main(String[] args){
       /* int [] nums = {1,2,3,4,5};
        int target = 3;*/
        int [] nums = {3,2,4};
        int target = 6;
    System.out.println("twoSum(nums,target) = " + Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] twoSum = new int[2];
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if((nums[i]+nums[j]) == target){
                    twoSum[0]=i;
                    twoSum[1]=j;
                }
            }
        }
      return twoSum;
    }
}
