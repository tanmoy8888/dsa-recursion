/*
package array.leet_code.hard;

import java.util.Arrays;

*/
/**
 *
 * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
 *
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,0]
 * Output: 3
 * Explanation: The numbers in the range [1,2] are all in the array.
 * Example 2:
 *
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Explanation: 1 is in the array but 2 is missing.
 * Example 3:
 *
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * Explanation: The smallest positive integer 1 is missing.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * @author Tanmoy Mukherjee
 *//*

public class FirstMissingPositive {
    public static void main(String[] args){
     int [] nums = {3,4,-1,1};

    }

    public static int firstMissingPositive(int[] nums) {
      if(nums.length ==0) return 0;
        Arrays.sort(nums);
        int max = nums[nums.length-1];
       // int average = (nums[0] + max)/2;
        //int startElement = nums[0];
        int endElement = nums[nums.length-1];
        //int start =0;
        int end = nums.length-1;
        while (end >= 0){
            if(startElement startElement <= average){
                start++;
            }
            if(endElement >= average){
                end--;
            }

        }

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] > 0){

            }

        }
    }
}
*/
