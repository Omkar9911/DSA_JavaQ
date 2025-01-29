package Array;

public class q68_WordSearch {

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        // Iterate through the board to find the starting letter of the word
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If the first letter matches, start DFS
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int row, int col, int index) {
        // If we have matched all characters in the word, return true
        if (index == word.length()) {
            return true;
        }

        // Check for out-of-bound indices or mismatched characters
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark the cell as visited by modifying it (e.g., using a temporary character)
        char temp = board[row][col];
        board[row][col] = '#'; // '#' indicates this cell is visited

        // Explore all 4 possible directions (up, down, left, right)
        boolean found = dfs(board, word, row + 1, col, index + 1) ||
                dfs(board, word, row - 1, col, index + 1) ||
                dfs(board, word, row, col + 1, index + 1) ||
                dfs(board, word, row, col - 1, index + 1);

        // Restore the cell's original value after DFS exploration
        board[row][col] = temp;

        return found;
    }

    public static void main(String[] args) {
        q68_WordSearch ws = new q68_WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        System.out.println(ws.exist(board, "ABCCED")); // Output: true
        System.out.println(ws.exist(board, "SEE"));    // Output: true
        System.out.println(ws.exist(board, "ABCB"));   // Output: false
    }

}
