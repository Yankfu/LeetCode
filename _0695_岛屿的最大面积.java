package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/15 上午11:33
 * @Version 1.0
 */
public class _0695_岛屿的最大面积 {
	public static void main(String[] args) {
		int[][] grid = {
				{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
				{0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
				{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
		};
		System.out.println(maxAreaOfIsland(grid));
	}

	public static int maxAreaOfIsland(int[][] grid) {
		int res = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					res = Math.max(help(i,j,grid),res);
				}
			}
		}
		return res;
	}
	public static int help (int i,int j,int[][] grid){
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0) {
			return 0;
		}
		int[][] temp = {
				{1,0},
				{0,1},
				{-1,0},
				{0,-1}
		};
		grid[i][j] = 0;
		int num = 1;
		for (int k = 0; k < 4; k++) {
			num += help(i+temp[k][0],j+temp[k][1],grid);
		}
		return num;
	}
}
