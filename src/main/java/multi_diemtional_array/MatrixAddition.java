package multi_diemtional_array;

/**
 * @author Tanmoy Mukherjee
 */
public class MatrixAddition {
    public static void main(String[] args){
        int [][] A = {{1,2},
                      {3,4}};
        int [][] B = {{1,1},
                      {2,2}};
        matrixSum(A,B);
    }

    private static void matrixSum(int [] [] A,int [] [] B ){
    int row = A.length;
    int column = A[0].length;
      int [][] sum = new int[row][column];
      for(int i = 0; i < row; i++) {
          for(int j = 0; j < column; j++) {
              sum[i][j] = A[i][j]+B[i][j];
        System.out.print(sum[i][j]+" ");
          }
          System.out.println();
      }
    }
}
