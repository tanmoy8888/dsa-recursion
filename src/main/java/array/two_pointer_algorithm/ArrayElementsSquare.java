package array.two_pointer_algorithm;

import java.util.Arrays;

/**
 * Problem : Given an array in sorted in non-decreasing order , return an array of
 * square of each elements in non-decreasing order
 *
 * I/P => {2,4,6,7,10}
 *
 * O/P => {4,16,36,49,100}
 *
 * @author Tanmoy Mukherjee
 */
public class ArrayElementsSquare {
    public static void main(String[] args){
        int [] arr = {2,4,6,7,10};
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(square(arr)));
  }

    private static int[] square(int [] arr){
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
    }

}
