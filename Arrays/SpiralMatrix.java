
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,  2,  3,  4},
            {12, 13, 14, 5},
            {11, 16, 15, 6}
        };

        System.out.println(spiralOrder(matrix));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

           
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
