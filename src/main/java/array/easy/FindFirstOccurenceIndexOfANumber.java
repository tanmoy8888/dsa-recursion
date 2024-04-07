package array.easy;

/**
 * @author Tanmoy Mukherjee
 */
public class FindFirstOccurenceIndexOfANumber {

    public static void main(String[] args){
     int [] arr = {3,4,-5,7,8,5,0,1,5};
     int target = 5;
    System.out.println("findFirstIndex(arr,target) = " + findFirstIndex(arr, target));
    }

    private static int findFirstIndex(int [] arr , int target){
        if(arr.length ==0) return 0;
        int firstIndex =-1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                firstIndex = i;
                break;
            }
        }
        return firstIndex;
    }
}
