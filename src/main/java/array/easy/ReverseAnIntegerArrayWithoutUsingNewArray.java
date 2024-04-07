package array.easy;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 */
public class ReverseAnIntegerArrayWithoutUsingNewArray {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9};
    System.out.println("reverseArray(arr) = " + Arrays.toString(reverseArray(arr)));
    }
    private static int [] reverseArray(int [] arr){
        int i = 0;
        int temp;
        int j = arr.length-1;
        while (j >= i){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
