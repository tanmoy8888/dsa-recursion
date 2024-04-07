package array.easy;

/**
 * @author Tanmoy Mukherjee
 */
public class CheckIfAnArrayIsSortedOrNot {
    public static void main(String[] args){
        int [] arr = {1,2,4,5,1,7,1,2};
        //int [] arr = {1,2,2,4,5,7,9,11};
    System.out.println("isSorted(arr) = " + isSorted(arr));
    }

    private static boolean isSorted(int [] arr){
        boolean isSorted = true;
        for(int i = 0; i < arr.length ; i++) {
            if(i > 0 && (arr[i] < arr[i-1])){
                isSorted =false;
                break;
            }
        }
        return isSorted;
    }

}
