package array.two_pointer_algorithm;

/**
 * @author Tanmoy Mukherjee
 */
public class PartitionArrayinTwoSubArray {
    public static void main(String[] args){
        //int [] arr = {5,3,2,6,3,1};  // true => Correct
        //int [] arr = {11,37,4,99,16,9,84,23,36,78,6,89,8,81,15,37,34,77,58,11};   // true => Correct
        //int [] arr = {1,1,1,1,1,1}; // true => Correct
       // int [] arr = {5,3,5,6,3,1}; //false => Correct
       // int [] arr = {4,2,4}; // true => Correct
       // int [] arr = {0,0,0}; // true => Correct
         int [] arr = {0,0}; // false => Correct
    System.out.println("isSubArrayPossible(arr) = " + isSubArrayPossible(arr));
  }

private static boolean isSubArrayPossible(int [] arr){
    if(arr.length ==0)return false;
    int prefixSum=0;
    int suffixSum =0;
    int start =0;
    int end =arr.length-1;
    while (start < end){
        prefixSum += arr[start];
        suffixSum += arr[end];
        if( prefixSum == suffixSum){
            return true;
        }
        else{
            start++;
            end--;
        }
    }
    return false;
    }

}

