package array.easy;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 */
public class FindFirstRepeatingNumber {
    public static void main(String[] args){
        int [] arr = {4,3,1,2,2,4,4,5,5,8,9};
    System.out.println("findFirstRepeatingNumber(arr) = " + findFirstRepeatingNumber(arr));
    }

    public static int findFirstRepeatingNumber(int [] arr){
        if(arr.length == 0) return 0;
    int number =0;
        Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
         if(i > 0 && arr[i] == arr[i-1]){
             number = arr[i];
             break;
         }
    }
    return number;
}
}
