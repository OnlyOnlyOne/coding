package backtracking;

public class Lc37解数独 {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        backtracking(0,0,board);
        System.out.println();
    }
    public static void solveSudoku(char[][] board) {
        backtracking(0,0,board);
    }

    public static boolean backtracking(int row,int col,char[][] board) {
        for (int i = row; i < 9; i++) {
            for (int j =col; j < 9; j++) {
                if (board[i][j] != '.') continue;
                for (char k = '1'; k <= '9'; k++) {
                    if (isValid(i, j, board, k)) {
                        board[i][j] = k;
                        if (backtracking(i,j,board)) {
                            return true;
                        }
                        board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(int row, int col, char[][] board, char k) {
        //判断行

        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == k) return false;
        }

        //判断列
        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == k) return false;
        }
        //判断宫
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == k) {
                    return false;
                }
            }
        }

        return true;
    }
}
