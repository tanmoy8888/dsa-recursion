package array.two_pointer_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tanmoy Mukherjee
 */
public class ThreeSumProblem {
    public static void main(String[] args){
    int [] arr = {4,2,-1,-3,0,1,2,3};
    Arrays.sort(arr);
    List<List<Integer>> triplets = new ArrayList<>();
    for(int i = 0; i < arr.length-2; i++) {
        if(i > 0 && arr[i] == arr[i-1]) continue;
        List<List<Integer>> list = twoSum(arr,-arr[i], i+1);
        for(List<Integer> list1 : list){
            list1.add(0,arr[i]);
            triplets.add(list1);
        }
    }
    System.out.println("Three Sum combinations are :: " + triplets);
    }

  private static List<List<Integer>> twoSum(int[] arr, int sum, int startFrom) {
    int left = startFrom;
    int right = arr.length - 1;
    List<List<Integer>> ans = new ArrayList<>();
    while (left < right) {
        if(left > 0 && (arr[left] == arr[left-1])){
            left++;
            continue;
        }
        if(right < arr.length-1 && (arr[right] == arr[right+1])){
            right--;
            continue;
        }
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
