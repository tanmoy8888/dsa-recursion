package array.two_pointer_algorithm;

import java.util.Arrays;
import java.util.Collections;

/**
 * Problem : Given an array in sorted in non-decreasing order , return an array of
 * square of each elements in non-decreasing order
 *
 * I/P => {2,4,6,7,10}
 *
 * O/P => {4,16,36,49,100}
 *
 * Another Example :
 * I/P => {-10,-3,-2,1,4,5}
 *
 * O/P => Should be => {1,4,9,16,25,100}
 * NOT THIS ONE =>  {100,9,4,1,16,25}  => BECAUSE THIS ALSO NEED TO BE SORTED AS WELL !!!!!!!!! [This is the twist !!!!]
 *
 * @author Tanmoy Mukherjee
 */
public class ArrayElementsSquare {
    public static void main(String[] args){
        //int [] arr = {2,4,6,7,10};
        int [] arr = {-10,-3,-2,1,4,5};
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(square(arr)));
  }

    private static int[] square(int [] arr){
        if(arr.length == 0) return new int[0];
        int start =0;
        int end = arr.length-1;
        int [] ans = new int[arr.length];
        int k =0;
        while (start <= end){
            if(Math.abs(arr[start])  > Math.abs(arr[end])){
                ans[k++] = arr[start] * arr[start];
                start++;
            }
            else {
                ans[k++] = arr[end] * arr[end];
                end--;
            }
        }
        int [] finalAns = new int[ans.length];
        int j=0;
        for(int i = ans.length-1; i >=0 ; i--) {
            finalAns[j]=ans[i];
            j++;
        }
        return finalAns;
    }

   /* private static int[] square(int [] arr){
        if(arr.length == 0) return new int[0];
        int start =0;
        int end = arr.length-1;
        int middle = start+end/2;
    System.out.println("middle = " + middle);
        while (start < end){
      System.out.println("check....");
            if(start < middle){
                arr[start] = arr[start] * arr[start];
        System.out.println("arr[start] = " + arr[start]);
                start++;
            }
            if(end >= middle){
                arr[end] = arr[end] * arr[end];
        System.out.println("arr[end] = " + arr[end]);
                end--;
            }
            if(middle > start && middle < end){
                arr[middle] = arr[middle] * arr[middle];
            }
        }
        return arr;
    }*/

}
