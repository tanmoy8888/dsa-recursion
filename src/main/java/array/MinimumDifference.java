package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Statement
 * Given an array of distinct integers, find all pairs of elements where the difference between the two elements is the smallest among all pairs in the array. Return these pairs in ascending order, where each pair is represented by [a, b], such that a, b are elements from the array and a < b. The difference between a and b should be the smallest possible.
 *
 * Example 1:
 * Input:
 *
 * arr = [12, 9, 8, 2, 11]
 *
 * Output:
 *
 * [[8, 9], [11, 12]]
 *
 * Example 2:
 * Input:
 *
 * arr = [22, 7, 1, 3, 11, 20, 19]
 *
 * Output:
 *
 * [[19, 20]]
 *
 * Constraints:
 * 2 <= |arr| <= 100000
 *
 * -100000 <= arr[i] <= 100000
 * @author Tanmoy Mukherjee
 */
public class MinimumDifference {
    public static void main(String[] args){
        int [] arr ={22, 7, 1, 3, 11, 20, 19};
    System.out.println("MinimumDifference is :: "+minimumAbsDifference(arr));
    }

    public static List<List< Integer>> minimumAbsDifference(int[] arr) {
        List<List< Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        int minDifference = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            minDifference = Math.min(minDifference, arr[i] - arr[i-1]);
        }
        for(int i = 1; i < n; i++) {
            if(arr[i]-arr[i-1]== minDifference){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                ans.add(list);
            }
        }
       return ans;
    }
}
