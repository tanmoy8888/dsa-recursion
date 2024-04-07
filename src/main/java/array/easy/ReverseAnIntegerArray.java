package array.easy;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 */
public class ReverseAnIntegerArray {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9};
    System.out.println("reverseArray(arr) = " + Arrays.toString(reverseArray(arr)));
    }

    private static int [] reverseArray(int [] arr){
        if(arr.length ==0 ) return new int[0];
        int [] ans = new int[arr.length];
        int j=0;
        for(int i = arr.length-1; i >= 0 ; i--) {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
}
