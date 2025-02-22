
//Create a matrix with alternating rectangles of O and X
/*
Write a code which inputs two numbers m and n and creates a matrix of size m x n (m rows and n columns) in which every elements is either X or 0. The Xs and 0s must be filled alternatively, the matrix should have outermost rectangle of Xs, then a rectangle of 0s, then a rectangle of Xs, and so on.

Examples:

Input: m = 3, n = 3
Output: Following matrix
X X X
X 0 X
X X X

Input: m = 4, n = 5
Output: Following matrix
X X X X X
X 0 0 0 X
X 0 0 0 X
X X X X X

Input:  m = 5, n = 5
Output: Following matrix
X X X X X
X 0 0 0 X
X 0 X 0 X
X 0 0 0 X
X X X X X

Input:  m = 6, n = 7
Output: Following matrix
X X X X X X X
X 0 0 0 0 0 X
X 0 X X X 0 X
X 0 X X X 0 X
X 0 0 0 0 0 X
X X X X X X X

*/

package Array;

import java.util.Scanner;

public class q72_AlternatingRectangleMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();
        scanner.close();

        char[][] matrix = new char[m][n];
        fillMatrix(matrix, m, n);
        printMatrix(matrix, m, n);
    }

    private static void fillMatrix(char[][] matrix, int m, int n) {
        int layer = 0;
        char fillChar = 'X';

        while (layer < (Math.min(m, n) + 1) / 2) {
            // Fill top row of the current layer
            for (int i = layer; i < n - layer; i++) {
                matrix[layer][i] = fillChar;
            }
            // Fill bottom row of the current layer
            for (int i = layer; i < n - layer; i++) {
                matrix[m - layer - 1][i] = fillChar;
            }
            // Fill left column of the current layer
            for (int i = layer; i < m - layer; i++) {
                matrix[i][layer] = fillChar;
            }
            // Fill right column of the current layer
            for (int i = layer; i < m - layer; i++) {
                matrix[i][n - layer - 1] = fillChar;
            }
            // Switch the character for the next inner layer
            fillChar = (fillChar == 'X') ? '0' : 'X';
            layer++;
        }
    }

    private static void printMatrix(char[][] matrix, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
