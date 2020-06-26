package com.LeetCode;

import java.util.HashSet;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/26 15:10
 */
public class _面试题_01_08_零矩阵 {
    //两个数组，一个记录要清零的行，一个记录要清零的列，然后再遍历一遍清零就行。
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> hang = new HashSet<>();
        HashSet<Integer> lie = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    hang.add(i);
                    lie.add(j);
                }
            }
        }
        //开始清零
        for (int i:hang){
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int i:lie){
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = 0;
            }
        }
    }
}
