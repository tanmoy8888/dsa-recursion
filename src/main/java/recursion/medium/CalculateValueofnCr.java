package recursion.medium;

/**
 * Input: n = 3, r = 2
 * Output: 3
 * Explaination: 3C2 = 3.
 *
 * @author Tanmoy Mukherjee
 */
public class CalculateValueofnCr {
    public static void main(String[] args){

    }
private static int nCr(int n, int r) {
    if (r > n)
        return 0;
    if (r == 0 || r == n)
        return 1;
    return nCr(n - 1, r - 1) + nCr(n - 1, r);
}
}
