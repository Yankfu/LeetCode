package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/23 下午9:13
 * @Version 1.0
 */
public class _0766_托普利茨矩阵 {
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3,4},
				{4,1,2,3},
				{3,4,1,2},
				{2,2,4,1},
		};
		System.out.println(isToeplitzMatrix(matrix));
	}
	public static boolean isToeplitzMatrix(int[][] matrix) {
		int temp;
		for (int i = matrix.length-1; i > 0; i--) {
			int j = 0;
			temp = matrix[i][j];
			int x = i,y = j;
			while (x<matrix.length && y<matrix[0].length) {
				if (matrix[x][y] != temp) {
					return false;
				}
				else {
					x++;
					y++;
				}
			}
		}
		for (int j = 0; j < matrix[0].length; j++) {
			int i = 0;
			temp = matrix[i][j];
			int x = i,y = j;
			while (x<matrix.length && y<matrix[0].length) {
				if (matrix[x][y] != temp) {
					return false;
				}
				else {
					x++;
					y++;
				}
			}
		}
		return true;
//		for (int r = 0; r < matrix.length; ++r)
//			for (int c = 0; c < matrix[0].length; ++c)
//				if (r > 0 && c > 0 && matrix[r-1][c-1] != matrix[r][c])
//					return false;
//		return true;
	}
}
