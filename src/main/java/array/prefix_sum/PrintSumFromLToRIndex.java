package array.prefix_sum;

/**
 * @author Tanmoy Mukherjee
 */
public class PrintSumFromLToRIndex {
    public static void main(String[] args){
     int [] arr = {2,4,1,3,6};
     int l = 1;
     int r = 3;
    System.out.println("findSum(arr,l,r) = " + findSum(arr, l, r));
    }

    private static int findSum(int [] arr , int l , int r){
     if(arr.length ==0) return 0;
     int sum =0;
     int start =0;
     int left = l-1;
     int right =r-1;
     int end = arr.length-1;
     while (start < end){
         if(left<=right){
             sum=arr[left]+ sum;
         }
         if( left > right){
             break;
         }
         else{
             left++;
         }
     }
     return sum;
    }
}
