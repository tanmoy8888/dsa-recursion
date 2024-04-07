package array.easy;

/**
 * @author Tanmoy Mukherjee
 */
public class FindMaxElementOfArray {
    public static void main(String[] args){
      int [] arr = {1,2,-3,4,-5};
    System.out.println("findMax(arr) = " + findMax(arr));
    }
    public static int findMax(int [] arr){
        if(arr.length ==0) return 0;
        int max = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }
            }
        return max;
    }
}
