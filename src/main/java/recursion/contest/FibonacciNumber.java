package recursion.contest;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such
 * that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * <p>F(0) = 0, F(1) = 1 F(n) = F(n - 1) + F(n - 2), for n > 1. Given n, calculate F(n).
 *
 * <p>Example 1:
 *
 * <p>Input: n = 2 Output: 1 Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1. Example 2:
 *
 * <p>Input: n = 3 Output: 2 Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2. Example 3:
 *
 * <p>Input: n = 4 Output: 3 Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 *
 * @author Tanmoy Mukherjee
 */
public class FibonacciNumber {
  private static final int NUMBER = 4;

  public static void main(String[] args) {
    FibonacciNumber number = new FibonacciNumber();
    System.out.println("number.fib(NUMBER) = " + number.fib(NUMBER));
  }

  public int fib(int n) {
    int i = 0;
    if (n == 0) return 0;
    if (n == 1) return i + 1;
    if (n > 1) {
      i = fib(n - 1) + fib(n - 2);
    }
    return i;
  }
}
