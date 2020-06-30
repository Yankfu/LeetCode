package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/30 22:55
 */
public class _0807_保持城市天际线 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int res = 0;
        int[] top = new int[grid[0].length];
        int[] left = new int[grid.length];
        int index = 0;
        for (int i = 0; i < grid.length; i++) {
            int big = 0;
            for (int j = 0; j < grid[0].length; j++) {
                big = Math.max(big,grid[i][j]);
            }
            left[index++] = big;
        }
        index = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int big = 0;
            for (int j = 0; j < grid.length; j++) {
                big = Math.max(big,grid[j][i]);
            }
            top[index++] = big;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int temp = Math.min(top[j],left[i]) - grid[i][j];
                if (temp > 0){
                    res += temp;
                }
            }
        }
        return res;
    }
}
