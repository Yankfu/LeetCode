package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/20 上午9:28
 * @Version 1.0
 */
public class _0980_不同路径III {
    public static void main(String[] args) {
        int[][] grid = {
                {2},
        };
        System.out.println(uniquePathsIII(grid));
    }
    static int res = 0;
    static int[][] direction = {
        {0, -1},
        {-1, 0},
        {0, 1},
        {1, 0}
    };
    public static int uniquePathsIII(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int total = 1;
        int nowX = 0;
        int nowY = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0){
                    total++;
                } else if (grid[i][j] == 1){
                    nowX = i;
                    nowY = j;
                }
            }
        }
        visited[nowX][nowY] = true;
        backTrack(grid,visited,0,total,nowX,nowY);
        return res;
    }
    public static void backTrack(int[][] grid,boolean[][] visited,int step,int total,int nowX,int nowY){
        if(grid[nowX][nowY] == 2 && step == total){
            res++;
        }else{
            for (int i = 0; i < 4; i++) {
                nowX += direction[i][0];
                nowY += direction[i][1];
                if( nowX >= 0 && nowX < grid.length && nowY >= 0 && nowY < grid[0].length &&
                        ( (grid[nowX][nowY] == 0 || grid[nowX][nowY] == 2) && !visited[nowX][nowY])){
                    visited[nowX][nowY] = true;
                    backTrack(grid,visited,step+1,total,nowX,nowY);
                    visited[nowX][nowY] = false;
                }
                nowX -= direction[i][0];
                nowY -= direction[i][1];
            }
        }
    }
}
