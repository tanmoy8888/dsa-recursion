package array.easy;

/**
 * @author Tanmoy Mukherjee
 */
public class CountNumberOfOccurrence {
    public static void main(String[] args){
       int [] arr = {1,2,4,5,1,7,1,2};
       int number = 2;
    System.out.println("countOccurrence(arr,number) = " + countOccurrence(arr, number));
    }

    private static int countOccurrence(int [] arr , int number){
        if(arr.length == 0) return 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                count++;
            }
        }
        return count;
    }
}
