package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/22 下午8:52
 * @Version 1.0
 */
public class _0064_最小路径和 {
	public static void main(String[] args) {
		int[][] grid = {
				{1,3,1},
				{1,5,1},
				{4,2,1}
		};
		System.out.println(minPathSum(grid));
	}
	public static int minPathSum(int[][] grid) {
		for(int i = grid.length-1;i>=0;i--){
			for (int j = grid[0].length-1; j >= 0 ; j--) {
				if(i == grid.length-1 && j == grid[0].length-1){
					continue;
				}else if(i == grid.length-1){
					grid[i][j] += grid[i][j+1];
				}else if(j == grid[0].length-1){
					grid[i][j] += grid[i+1][j];
				}else{
					grid[i][j] += (grid[i+1][j]>grid[i][j+1]?grid[i][j+1]:grid[i+1][j]);
				}
			}
		}
		for(int[] a:grid){
			for(int aa:a){
				System.out.print(aa+" ");
			}
			System.out.println();
		}
		return grid[0][0];
	}
}
