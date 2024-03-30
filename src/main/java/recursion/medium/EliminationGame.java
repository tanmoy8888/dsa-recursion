/*
package recursion.medium;

import java.util.Arrays;
import java.util.Collections;

*/
/**
 * You have a list arr of all integers in the range [1, n] sorted in a strictly increasing order.
 * Apply the following algorithm on arr:
 *
 * <p>Starting from left to right, remove the first number and every other number afterward until
 * you reach the end of the list. Repeat the previous step again, but this time from right to left,
 * remove the rightmost number and every other number from the remaining numbers. Keep repeating the
 * steps again, alternating left to right and right to left, until a single number remains. Given
 * the integer n, return the last number that remains in arr.
 *
 * <p>Example 1:
 *
 * <p>Input: n = 9 Output: 6 Explanation: arr = [1, 2, 3, 4, 5, 6, 7, 8, 9] arr = [2, 4, 6, 8] arr =
 * [2, 6] arr = [6] Example 2:
 *
 * <p>Input: n = 1 Output: 1
 *
 * <p>Constraints:
 *
 * <p>1 <= n <= 109
 *
 * @author Tanmoy Mukherjee
 *//*

public class EliminationGame {

   private static final int NUMBER = 9;
    public static void main(String[] args){
     EliminationGame game = new EliminationGame();
     game.lastRemaining(NUMBER);
    }

    public int lastRemaining(int n) {
        Integer [] arr = new Integer[n];
        for(int i = 0; i <n ; i++) {
            arr[i]=i+1;
        }
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int iteration = arr.length/2;
    System.out.println("iteration = " + iteration);
    for(int j = 1; j <=iteration ; j++) {

        if(j%2==0){
         for(int k = 0; k < arr.length ; k++) {
             arr[k] = k+1;
         }
         }
         if(j%2 !=0){
         Arrays.sort(arr,Collections.reverseOrder());
         for(int i = 0; i < ; i++) {

         }
         }
        }

    }
        //return iteration;



}
*/
