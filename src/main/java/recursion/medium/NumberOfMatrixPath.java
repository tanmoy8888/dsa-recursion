package recursion.medium;

/**
 * Problem Statement
 * Count every path that can lead from the top left to the bottom right of a M X N matrix,
 * with the restriction that you can only move right or down from each cell
 * Example 1:
 * Input:
 * <p>
 * M = 2, N = 2
 * <p>
 * Output:
 * 2
 * Explanation:
 * <p>
 * There are only two paths
 * (0, 0) -> (0, 1) -> (1, 1)
 * (0, 0) -> (1, 0) -> (1, 1)
 * <p>
 * Example 2:
 * Input:
 * <p>
 * M = 2, N = 3
 * <p>
 * Output:
 * 3
 * Explanation:
 * <p>
 * There are three paths
 * (0, 0) -> (0, 1) -> (0, 2) -> (1, 2)
 * (0, 0) -> (0, 1) -> (1, 1) -> (1, 2)
 * (0, 0) -> (1, 0) -> (1, 1) -> (1, 2)

 * Constraints:
 * 1 <= N, M <= 10
 *
 * @author Tanmoy Mukherjee
 */
public class NumberOfMatrixPath {
    private static final int M =4;
    private static final int N =4;
    public static void main(String[] args){
    System.out.println("numberOfPaths(M,N) = " + numberOfPaths(M, N));
    }

    public static int numberOfPaths(int m, int n) {
        return numberOfPathsHelper(m-1,n-1);
    }

    public static int numberOfPathsHelper(int m, int n) {
        if(m == 0 && n == 0) return 1;
    int count =0;
        if(m > 0){
            count += numberOfPathsHelper(m-1,n);
        }
        if(n > 0){
            count += numberOfPathsHelper(m,n-1);
        }
     return count;
    }
}
