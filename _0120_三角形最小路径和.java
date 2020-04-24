package com.LeetCode;

import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/24 22:48
 */
public class _0120_三角形最小路径和 {
    public static void main(String[] args) {

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0){
            return 0;
        }
        int[] temp = new int[triangle.size()+1];
        for (int i = triangle.size(); i >=0 ; i--) {
            List<Integer> rows = triangle.get(i);
            for (int j = 0; j < rows.size(); j++) {
                temp[j] = Math.min(temp[j],temp[j+1])+rows.get(j);
            }
        }
        return temp[0];
    }
}
