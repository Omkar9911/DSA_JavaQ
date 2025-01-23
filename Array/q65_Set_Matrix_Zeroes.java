
//Set Matrix Zeroes
/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.



Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */


package Array;

import java.util.Arrays;

public class q65_Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {

    int rows = matrix.length;
    int cols = matrix[0].length;

    boolean firstRowHasZero = false;
    boolean firstColHasZero = false;

    // Check if first row has zero
        for (int j = 0; j < cols; j++) {
        if (matrix[0][j] == 0) {
            firstRowHasZero = true;
            break;
        }
    }

    // Check if first column has zero
        for (int i = 0; i < rows; i++) {
        if (matrix[i][0] == 0) {
            firstColHasZero = true;
            break;
        }
    }

    // Use first row and column as markers
        for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    // Nullify rows based on markers
        for (int i = 1; i < rows; i++) {
        if (matrix[i][0] == 0) {
            for (int j = 1; j < cols; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    // Nullify columns based on markers
        for (int j = 1; j < cols; j++) {
        if (matrix[0][j] == 0) {
            for (int i = 1; i < rows; i++) {
                matrix[i][j] = 0;
            }
        }
    }

    // Nullify the first row if needed
        if (firstRowHasZero) {
        for (int j = 0; j < cols; j++) {
            matrix[0][j] = 0;
        }
    }

    // Nullify the first column if needed
        if (firstColHasZero) {
        for (int i = 0; i < rows; i++) {
            matrix[i][0] = 0;
        }
    }
}

public static void main(String[] args) {
    q65_Set_Matrix_Zeroes solution = new q65_Set_Matrix_Zeroes();

    int[][] matrix1 = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
    };
    solution.setZeroes(matrix1);
    System.out.println(Arrays.deepToString(matrix1));

    int[][] matrix2 = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
    };
    solution.setZeroes(matrix2);
    System.out.println(Arrays.deepToString(matrix2));

}
}
