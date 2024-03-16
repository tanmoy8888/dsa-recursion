package recursion.easy;

/**
 * This code will print sum of N natural number using recursion
 *
 * @author Tanmoy Mukherjee
 */
public class SumOfNaturalNumbers {
  public static void main(String[] args) {
    System.out.println("Sum of N natural numbers is " + sum(2));
  }

  private static int sum(int n) {
    if (n > 0) {
      if (n == 1) {
        return n;
      }
      return sum(n - 1) + n;
    } else {
      return n;
    }
  }
}
