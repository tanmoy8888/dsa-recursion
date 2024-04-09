package array.two_pointer_algorithm;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 */
public class SortEvenAndOddNumber {
    public static void main(String[] args){
        //int [] arr = {1,2,3,4,5,6,7,8,9};
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Arrays.toString(sortArray(arr)) = " + Arrays.toString(sortArray(arr)));
    }

    public static int[] sortArray(int [] arr){
        if(arr.length == 0) return new int[0];
        int start =0;
        int end = arr.length-1;
        while (start < end){
            if(arr[start] % 2 != 0 || arr[end] % 2 == 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            if(arr[start] % 2 ==0){
                start++;
            }
            if(arr[end] % 2 !=0){
                end--;
            }
        }
        return arr;
    }
}
