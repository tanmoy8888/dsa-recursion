package array.two_pointer_algorithm;

/**
 * @author Tanmoy Mukherjee
 */
public class PartitionArrayinTwoSubArray {
    public static void main(String[] args){
        int [] arr = {5,3,2,6,3,1};
        //int [] arr = {1,1,1,1,1,1};
        //int [] arr = {5,3,5,6,3,1};
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
        if(prefixSum == suffixSum){
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

