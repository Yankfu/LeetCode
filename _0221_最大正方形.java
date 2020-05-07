package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/8 0:16
 */
public class _0221_最大正方形 {
    public static void main(String[] args) {

    }
    public int maximalSquare(char[][] matrix) {
        int max = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return max;
        }
        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1'){
                    if (i == 0 || j == 0) {
                        temp[i][j] = 1;
                    }else {
                        temp[i][j] = Math.min(temp[i][j-1],Math.min(temp[i-1][j],temp[i-1][j-1]))+1;
                    }
                }
                max = Math.max(max, temp[i][j]);
            }
        }
        return max*max;
    }
}
