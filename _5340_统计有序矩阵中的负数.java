package com.LeetCode;

public class _5340_统计有序矩阵中的负数 {
    public static void main(String[] args) {
        int[][] grid = {
                {-1}
        };
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int res = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    res = res+grid[i].length-j;
                    break;
                }
            }
        }
        return res;
    }
}
