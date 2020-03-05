package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/5 下午10:24
 * @Version 1.0
 */
public class _0463_岛屿的周长 {
	public static void main(String[] args) {
		int[][] grid = {
				{0,1,0,0},
				{1,1,1,0},
				{0,1,0,0},
				{1,1,0,0}
		};
		System.out.println(islandPerimeter(grid));
	}
	public static int islandPerimeter(int[][] grid) {
		int res = 0;
		int[][] temp = {
				{-1,0},
				{1,0},
				{0,1},
				{0,-1}
		};
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 1){
					for (int k = 0; k < 4; k++) {
						i = i+temp[k][0];
						j = j+temp[k][1];

						if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
							res++;
						} else if (grid[i][j] == 0) {
							res++;
						}

						i = i-temp[k][0];
						j = j-temp[k][1];
					}
				}else{
					continue;
				}
			}
		}
		return res;
	}
}
