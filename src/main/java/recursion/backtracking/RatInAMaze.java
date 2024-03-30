package recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement In a square matrix of order N * N, imagine a rat placed at position (0, 0). The
 * final location must be reached at (N - 1, N - 1). Find every route the rat might possibly take to
 * go from point A to point B. The rat can move in the following directions: "U" (up), "D" (down),
 * "L" (left), and "R" (right). Rats cannot move to a cell with a value of 0 in the matrix because
 * it is blocked, while rats can pass through cells with a value of 1 in the matrix. No cell can be
 * visited more than once in a journey. The rat cannot go to any other cell if the originating cell
 * is 0.
 *
 * <p>Complete the function findPath() which takes N and 2D array m[ ][ ] as input parameters and
 * returns the list of paths in lexicographically increasing order.
 *
 * <p>Example 1: Input: N = 4 m[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}}
 * Output: DDRDRR DRDDRR Explanation: The rat can reach the destination at (3, 3) from (0, 0) by two
 * paths - DRDDRR and DDRDRR, when printed in sorted order we get DDRDRR DRDDRR. Example 2: Input: N
 * = 2 m[][] = {{1, 1}, {1, 1}}
 *
 * <p>Output: DR RD Constraints: 2 ≤ N ≤ 5 0 ≤ Mat[i][j] ≤ 1
 *
 * @author Tanmoy Mukherjee
 */
public class RatInAMaze {
    public static void main(String[] args){

       int arr [][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}};
        RatInAMaze maze = new RatInAMaze();
    //System.out.println("Paths are ::  " + maze.findPath(arr, 4));
        maze.findPath(arr, 4);
    }


    //public static ArrayList<String> findPath(int[][] arr, int n) {
    public static void findPath(int[][] arr, int n) {
        //You can code here
        int M = 4;
        int N = 4;
        boolean [][] vis  = new boolean[M][N];
        vis[0][0] = true;
        String path ="";

         findPathHelper(arr,vis,0,0,M,N,path);

    }

    //private static ArrayList<String> findPathHelper(int[][] arr , boolean[][] vis, int i , int j , int M,int N, String path){
    private static void findPathHelper(int[][] arr , boolean[][] vis, int i , int j , int M,int N, String path){
       // ArrayList<String> list = new ArrayList<>();
    System.out.println("inside findPathHelper().................");
     if(i == N-1 && j== M-1) {
      System.out.println("path = " + path);
        // list.add(path);
        // return list;
         return;
     }
     if(isValid(arr,vis,i+1,j,M,N)){ // D
         vis[i+1][j]=true;
         findPathHelper(arr,vis,i+1,j,M,N,path+'D');
         vis[i+1][j]=false;
     }
        if(isValid(arr,vis,i,j-1,M,N)){ // L
            vis[i][j-1]=true;
            findPathHelper(arr,vis,i,j-1,M,N,path+'L');
            vis[i][j-1]=false;
        }

        if(isValid(arr,vis,i,j+1,M,N)){ // R
            vis[i][j+1]=true;
            findPathHelper(arr,vis,i,j+1,M,N,path+'R');
            vis[i][j+1]=false;
        }

        if(isValid(arr,vis,i-1,j,M,N)){ // U
            vis[i-1][j]=true;
            findPathHelper(arr,vis,i-1,j,M,N,path+'R');
            vis[i-1][j]=false;
        }
      //return list;
    }

    private static boolean isValid(int[][] arr , boolean vis[][], int i , int j , int M,int N){
        if((i >= 0 &&  i< N ) && (j >= 0 && j <M) && arr[i][i]==1 && !vis[i][j]){
            return true;
        }
        else{
            return false;
        }
    }

}
