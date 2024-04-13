package array.prefix_sum;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 */
public class PrefixSum {
    public static void main(String[] args){
     //int [] arr ={1,2,3,4,5};
     int [] arr ={1,1,1,1,1};
    System.out.println("Arrays.toString(prefixSum(arr)) = " + Arrays.toString(prefixSum(arr)));
    }

    public static int [] prefixSum(int [] arr){
        if(arr.length ==0) return new int[0];
            for(int i = 1; i < arr.length; i++) {
                arr[i]= arr[i]+arr[i-1];
            }
            return arr;
    }
}
