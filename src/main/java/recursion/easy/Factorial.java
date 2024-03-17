package recursion.easy;

/**
 * @author Tanmoy Mukherjee
 */
public class Factorial {
    private static final int INPUT = 4;
    public static void main(String[] args){
    System.out.println("Factorial is ::  " + fact(INPUT));
    }

    private static int fact(int number){
        if(number==0 || number == 1) return 1;
        return number * fact(number-1);
    }
}
