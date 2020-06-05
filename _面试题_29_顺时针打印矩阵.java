package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/29 22:40
 */
public class _面试题_29_顺时针打印矩阵 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) {
            return new int[0];
        }
        int[] res = new int[matrix.length*matrix[0].length];
        int x = 0;
        int y = 0;
        //0→  1↓  2←  3↑
        int flag = 0;
        for (int i = 0; i < res.length; i++) {
            if (flag == 0){
                while (x < matrix[0].length && matrix[x+1][y]!=-1){
                    res[i++] = matrix[x][y];
                    matrix[x++][y] = -1;
                }
                flag++;
                i--;
                x--;
                y++;
            }else if (flag == 1){
                while (y < matrix.length && matrix[x][y+1]!=-1){
                    res[i++] = matrix[x][y];
                    matrix[x][y++] = -1;
                }
                flag++;
                i--;
                y--;
                x--;
            }else if (flag == 2){
                while (x > 0 && matrix[x-1][y]!=-1){
                    res[i++] = matrix[x][y];
                    matrix[x--][y] = -1;
                }
                flag++;
                i--;
                x++;
                y--;
            }else if (flag == 3){
                while (y > 0 && matrix[x][y-1]!=-1){
                    res[i++] = matrix[x][y];
                    matrix[x][y--] = -1;
                }
                flag = 0;
                i--;
                y++;
                x++;
            }
        }
        return res;
    }
}
