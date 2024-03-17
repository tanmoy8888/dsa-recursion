package recursion.easy;

/**
 * @author Tanmoy Mukherjee
 */
public class CheckIfArrayIsSorted {
    private static final int [] ARRAY = {1, 2, 3, 4, 5};
  //  private static final int [] ARRAY = {1, 2, 4, 3, 5};
    private static final int ARRAY_SIZE = 5;
    public static void main(String[] args){
    System.out.println(
        "Is given array is sorted :: " + arraySortedOrNot(ARRAY, ARRAY_SIZE));
    }
    public static boolean arraySortedOrNot(int []arr, int n){
        return arraySortedOrNotHelper(arr,n,0);
    }

    public static boolean arraySortedOrNotHelper(int []arr, int n , int index){
      if(index == n-1){
          return true;
      }
      if(arr[index] < arr[index+1] || arr[index] == arr[index+1]){
          return arraySortedOrNotHelper(arr,n,index+1);
      }
      else{
          return false;
      }
    }
}
