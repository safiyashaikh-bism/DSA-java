import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix={{1,0,1},{1,1,1},{1,1,1}};
        set(matrix);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    static void set(int[][] matrix)
    {
         int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
