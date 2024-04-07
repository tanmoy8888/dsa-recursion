package array.easy;

/**
 * @author Tanmoy Mukherjee
 */
public class FindLastOccurrenceIndexOfANumberInAnArray {
    public static void main(String[] args){
        int [] arr = {1,2,4,5,1,7,1,2};
        int number = 1;
    System.out.println("lastOccurrence(arr,number) = " + lastOccurrence(arr, number));
  }

  private static int lastOccurrence(int[] arr, int number) {
        if(arr.length == 0) return 0;
        int lastIndex = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                lastIndex=i;
            }
        }
        return lastIndex;
    }
}
