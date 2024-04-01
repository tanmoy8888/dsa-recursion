package array.two_pointer_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tanmoy Mukherjee
 */
public class TwoSumProblem {
    public static void main(String[] args){
    int [] arr = {4,2,-1,-3,0,1,2,3};
    int sum = 5;
    Arrays.sort(arr);
    System.out.println("Two Sum combinations are :: " + twoSum(arr, sum));
    }

  private static List<List<Integer>> twoSum(int[] arr, int sum) {
    int left = 0;
    int right = arr.length - 1;
    List<List<Integer>> ans = new ArrayList<>();
    while (left < right) {
      if ((arr[left] + arr[right]) > sum) {
        right--;
      } else if ((arr[left] + arr[right]) < sum) {
        left++;
      } else {
        List<Integer> list = new ArrayList<>();
        list.add(arr[left]);
        list.add(arr[right]);
        ans.add(list);
        left++;
        right--;
      }
    }
    return ans;
  }
}
