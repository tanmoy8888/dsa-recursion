package recursion.easy;

/**
 * @author Tanmoy Mukherjee
 */
public class FibonacciSeries {
  private static final int NUMBER = 7;

  public static void main(String[] args) {
    for (int i = 0; i < NUMBER; i++) {
      System.out.println("Fibonacci Series :: "+fibonacci(i));
    }
  }

  private static int fibonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
