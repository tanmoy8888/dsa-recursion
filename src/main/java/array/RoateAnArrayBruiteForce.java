package array;

import java.util.Arrays;

/**
 * Problem Statement Given an array of integers A and multiple values in B, which represents the
 * number of times array A needs to be left rotated.
 *
 * <p>Find the rotated array for each value and return the result in a matrix where the ith row
 * represents the rotated array for the ith value in B.
 *
 * <p>After every rotation, array A becomes equal to the original.
 *
 * <p>Example 1: Input:
 *
 * <p>A = [1, 2, 3, 4, 5]
 *
 * <p>B = [3, 2]
 *
 * <p>Output:
 *
 * <p>[[4, 5, 1, 2, 3], [3, 4, 5, 1, 2]]
 *
 * <p>Explanation:
 *
 * <p>B[0] = 2 which requires 2 times left rotations
 *
 * <p>1: [2, 3, 4, 5, 1]
 *
 * <p>2: [3, 4, 5, 1, 2]
 *
 * <p>B[1] = 3 which requires 3 times left rotation
 *
 * <p>1: [2, 3, 4, 5, 1]
 *
 * <p>2: [3, 4, 5, 1, 2]
 *
 * <p>2: [4, 5, 1, 2, 3]
 *
 * <p>Example 2: Input:
 *
 * <p>4 1
 *
 * <p>5 17 100 11
 *
 * <p>1
 *
 * <p>Output:
 *
 * <p>[[17, 100, 11, 5]]
 *
 * <p>Constraints: 1 <= N <= 2 * 103
 *
 * <p>1 <= M <= 2 * 103
 *
 * <p>-109 <= A[i] <= 109
 *
 * <p>0 <= B[j] <= 2000
 *
 * @author Tanmoy Mukherjee
 */
public class RoateAnArrayBruiteForce {
  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5};
    int[] b = {2,3};
    int[][] ans = new int[b.length][arr.length];
    for(int i = 0; i < b.length; i++) {
      ans[i]=rotateArray(arr,b[i]);
    }
    // int k = 3;
    // rotateArray(arr, k);

    System.out.println("Printing final array elements.....");
      for(int i = 0; i < ans.length; i++) {
          System.out.println("ans[i] = " + Arrays.toString(ans[i]));
      }
  }

  private static int[] rotateArray(int arr[], int k) {
    System.out.println("Inside rotateArray()...........");
      int rotate[] = Arrays.copyOf(arr,arr.length);
    for (int i = 0; i < k; i++) {
      int temp = rotate[0];
      for (int j = 0; j < rotate.length - 1; j++) {
          rotate[j] = rotate[j + 1];
      }
        rotate[rotate.length - 1] = temp;
      System.out.println("arr = " + Arrays.toString(rotate));
    }
    return rotate;
  }
}
