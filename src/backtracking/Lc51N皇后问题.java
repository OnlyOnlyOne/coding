package backtracking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc51N皇后问题 {
    static List<List<String>> results = new ArrayList<>();
    static List<String> path = new ArrayList<>();

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] c : board) {
            Arrays.fill(c, '.');
        }

        backtracking(board, 0, n);
        return results;
    }

    public static List Array2List(char[][] chessboard) {
        List<String> list = new ArrayList<>();

        for (char[] c : chessboard) {
            list.add(String.copyValueOf(c));
        }
        return list;
    }

    public static void backtracking(char[][] board, int row, int n) {
        if (row == n) {
            results.add(Array2List(board));
            return;
        }


        for (int j = 0; j < n; j++) {
            if (isValidate(row, j, board, n)) {
                board[row][j] = 'Q';
                backtracking(board, row + 1, n);
                board[row][j] = '.';
            }

        }
    }

    public static boolean isValidate(int row, int col, char[][] board, int n) {
        //列是否有效
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //检查45度
        for (int i = row - 1, j = col - 1; j >= 0 && i >= 0; j--, i--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j <= n - 1; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        solveNQueens(4);
    }
}
