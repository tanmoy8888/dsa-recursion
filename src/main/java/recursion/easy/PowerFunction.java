package recursion.easy;

/**
 * Problem Statement
 * Given two integers x and n, write a function to determine xn.
 * Input :
 * x = 2, n = 3
 * Output :
 * 8
 *Constraints:
 * -100 < x < 100
 *
 * 0 <= n <= 100
 *
 * x and n are integers.
 *
 * Either x is not zero or n is not zero.
 *
 * 0 <= xn <= 104
 *
 * @author Tanmoy Mukherjee
 */
public class PowerFunction {
    private static final int NUMBER = 2;
    private static final int POWER = 4;
    public static void main(String[] args){
    System.out.println("Power is :: " + power(NUMBER,POWER));
    }
    public static int power(int x, int n){
        if(x == 0 ){
            return 0;
        }
        else if(n==0){
            return 1;
        }
        return x * power(x,n-1);
    }
}
