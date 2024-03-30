package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * Problem Statement
 * Given an array of integers A, sort the array into a wave-like array and return it. Arrange the elements into a sequence such that -
 *
 * a1 >= a2 <= a3 >= a4 <= a5.....
 *
 * NOTE: If multiple answers are possible, return the lexicographically smallest one.
 *
 * Example 1:
 * Input:
 *
 * A = [1, 2, 3, 4]
 *
 * Output:
 *
 * [2, 1, 4, 3]
 *
 * Example 2:
 * Input:
 * A[] = [2, 4, 7, 8, 9, 10]
 * Output:
 * [4, 2, 8, 7, 10, 9]
 * Constraints:
 * 1 <= | A | <= 106
 *
 * 1 <= Ai <= 106
 * @author Tanmoy Mukherjee
 */
public class WaveArray {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    System.out.println("wave(list) = " + wave(list));
  }

    public static ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        for(int i = 1; i < n; i++) {
      if (i % 2 != 0) {
        int temp = A.get(i);
        //System.out.println("temp = " + temp);
        A.set(i, A.get(i - 1));
        //System.out.println(A.set(i, A.get(i - 1)));
        A.set(i - 1, temp);
        //System.out.println(A.set(i - 1, temp));
            }
        }
      return A;
    }
}
