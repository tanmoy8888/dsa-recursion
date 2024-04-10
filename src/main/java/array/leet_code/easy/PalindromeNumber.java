package array.leet_code.easy;

import java.util.Arrays;

/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 *
 *
 * Follow up: Could you solve it without converting the integer to a string?
 *
 * @author Tanmoy Mukherjee
 */
public class PalindromeNumber {
    public static void main(String[] args){
        int input = -121;
    System.out.println("isPalindrome(input) = " + isPalindrome(input));
    }

    public static boolean isPalindrome(int x) {
      if(x == 0) return true;
      int [] arr = convertNumberToArray(x);
      int start = 0;
      int end = arr.length-1;
      boolean palindrome = true;
      while (start < end){
          if(arr[start] == arr[end]){
        System.out.println("arr[start] = " + arr[start]);
        System.out.println("arr[end] = " + arr[end]);
              start++;
              end--;
          }else{
              palindrome = false;
              break;
          }
      }
     return palindrome;
    }

    private static int [] convertNumberToArray(int x){
        String converted = Integer.toString(x);
        int [] arr = new int[converted.length()];
        int index =0;
        while (x >0){
            int reminder = x%10;
            x = x/10;
            arr[index++] = reminder;
        }
    return arr;
    }

}
