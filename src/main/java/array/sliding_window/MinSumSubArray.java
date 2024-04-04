package array.sliding_window;

/**
 * Problem Statement Given an array of positive integers A and a positive integer K, return the
 * minimal length of a Subarray whose sum is greater than or equal to the target. If there is no
 * such subarray, return 0 instead.
 *
 * <p>Example 1: Input: target = 7 nums = [2,3,1,2,4,3] Output: 2 Explanation: The subarray [4,3]
 * has the minimal length under the problem constraint. Example 2: Input: target = 4 nums = [1,4,4]
 * Output: 1 Constraints: 1 <= K <= 109
 *
 * <p>1 <= A.length <= 105
 *
 * <p>1 <= A[i] <= 104
 *
 * @author Tanmoy Mukherjee
 */
public class MinSumSubArray {
    public static void main(String[] args){
     int [] arr = {2,3,1,2,4,3};
     int target = 7;
    System.out.println("min Sub Array Length is :: " + minSubArrayLen(target, arr));
    }

    public static int minSubArrayLen(int K, int[] A) {
      int left =0 , right =0;
      int currSum =0;
      int minLength = Integer.MAX_VALUE;
      int n = A.length;
      while (right < n){
          currSum += A[right];
          while (currSum >= K){
              minLength = Math.min(minLength, right-left+1);
              currSum-=A[left];
              left++;
          }
          right++;
      }
      if(minLength == Integer.MAX_VALUE){
          minLength = 0;
      }
      return minLength;
    }
}
