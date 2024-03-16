package recursion.easy;

/**
 * @author Tanmoy Mukherjee
 */
public class Palindrome {
    //private final static String TEST_STRING = "abcba";
    private final static String TEST_STRING = "Tanmoy";
  public static void main(String[] args) {
      boolean isPalindrome = isPalindrome(TEST_STRING,0,TEST_STRING.length()-1);
    System.out.println("isPalindrome = " + isPalindrome);
  }

  private static boolean isPalindrome(String str,int l,int r) {
    if (l >= r) {
      return true;
    }
    if (str.charAt(l) == str.charAt(r)) {
      return isPalindrome(str, l+1, r-1);
    } else return false;
  }
}
