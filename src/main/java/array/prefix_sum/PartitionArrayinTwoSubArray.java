package array.prefix_sum;

/**
 * @author Tanmoy Mukherjee
 */
public class PartitionArrayinTwoSubArray {
    public static void main(String[] args){
        //int [] arr = {5,3,2,6,3,1};
        int [] arr = {5,3,5,6,3,1};
    System.out.println("findSubArrayPossible(arr) = " + findSubArrayPossible(arr));
    }

    private static boolean findSubArrayPossible(int [] arr){
     int totalSum = totalSumofArray(arr);
     int prefixSum=0;
     for(int i = 0; i < arr.length; i++) {
         prefixSum +=arr[i];
        int suffixSum = totalSum-prefixSum;
        if(prefixSum == suffixSum){
            return true;
        }
     }
     return false;
    }

    private static int totalSumofArray(int [] arr){
        int sum=0;
        for(int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }


}
