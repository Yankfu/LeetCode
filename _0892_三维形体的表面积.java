package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/25 下午8:23
 * @Version 1.0
 */
public class _0892_三维形体的表面积 {
	public static void main(String[] args) {
		int[][] grid = {
				{2}
		};
		System.out.println(surfaceArea(grid));
	}
	public static int surfaceArea(int[][] grid) {
		int res = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				res += face(grid,i,j);
			}
		}
		return res;
	}
	public static int face(int[][] grid , int i,int j){
		if (grid[i][j] == 0){
			return 0;
		}
		int res = grid[i][j]*4 + 2; //先把所有的面加上 前后左右上下
		//然后我们开始减
		if (i > 0) { //如果是最上面一行，就不用减上面的部分
			res -= Math.min(grid[i][j],grid[i-1][j]);
		}
		if (j > 0) { //如果是最左边一行，就不用减左边的部分
			res -= Math.min(grid[i][j],grid[i][j-1]);
		}
		if (i < grid.length-1) { //如果是最下面一行，就不用减下面的部分
			res -= Math.min(grid[i][j],grid[i+1][j]);
		}
		if (j < grid[0].length-1) { //如果是最右面一行，就不用减右面的部分
			res -= Math.min(grid[i][j],grid[i][j+1]);
		}
		return res;
	}
}
