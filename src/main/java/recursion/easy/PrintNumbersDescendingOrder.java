package recursion.easy;

/**
 * This recursion program will print numbers in descending order.
 * @author Tanmoy Mukherjee
 */
public class PrintNumbersDescendingOrder {
  public static void main(String[] args) {
    printNumbers(5);
  }

  private static void printNumbers(int n) {
    if (n > 0) {
      printNumbers(n - 1);
      System.out.println("Number " + n);
    }
  }
}
