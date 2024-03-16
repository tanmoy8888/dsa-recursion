package recursion.easy;

/**
 * @author Tanmoy Mukherjee
 */
public class PrintNumbersNaturalOrder {
    public static void main(String[] args){
        printNumbers(5);

    }
    private static int printNumbers(int n){
        if(n ==0){
            return n;
        }
        System.out.println("Numbers :: " + n);
        return printNumbers(n-1);
    }
}
