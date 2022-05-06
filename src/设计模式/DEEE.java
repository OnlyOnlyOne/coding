package 设计模式;

import java.util.Scanner;

public class DEEE {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int solve(String[][] matrix) {
        //角必须为"."
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] flag = new int[m][n];
        int res = 0;
        for(int i =0;i < m ;i++){
            for(int j = 0;j < n;j++){
                if(matrix[i][j].equals("_")) continue;
                flag[i][j] = j == 0 ? 0 : flag[i][j - 1] + 1;
                int min = Integer.MAX_VALUE;
                for(int k = 0; k <= i;k++){
                    if(matrix[i - k][j] == "_") break;
                    min = Math.min(min,flag[i - k][j]);
                    res += min;
                }
            }
        }
        return res / 2;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _matrix_rows = 0;
        int _matrix_cols = 0;
        _matrix_rows = Integer.parseInt(in.nextLine().trim());
        _matrix_cols = Integer.parseInt(in.nextLine().trim());

        String[][] _matrix = new String[_matrix_rows][_matrix_cols];
        for(int _matrix_i=0; _matrix_i<_matrix_rows; _matrix_i++) {
            for(int _matrix_j=0; _matrix_j<_matrix_cols; _matrix_j++) {
                _matrix[_matrix_i][_matrix_j] = in.next();

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = solve(_matrix);
        System.out.println(String.valueOf(res));

    }
}
