package com.LeetCode;

public class _0059_螺旋矩阵II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] temp = generateMatrix(100);
		for(int[] a:temp) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}

	public static int[][] generateMatrix(int n) {
		if(n==1) {
			int[][] res = {{1}};
			return res;
		}
		int[][] res = new int[n][n];
		int i=0;
		int j=0;
		int k=1;
		while (true) {
			if ((j >= res[0].length || i >= res.length || j < 0 || i < 0) || res[i][j] != 0) {
				break;
			}
			while (true) {
				if (j == res[0].length || res[i][j] != 0) {
					break;
				} else {
					// System.out.println(i+" "+j);
					res[i][j] = k;
					k++;
					j++;
				}
			}
			j--;
			i++;
//			System.out.println(i+"  "+j);
			while (true) {
				if (i == res.length || res[i][j] != 0) {
					break;
				} else {
					res[i][j] = k;
					k++;
					i++;
				}
			}
			i--;
			j--;
			while (true) {
				if (j == -1 || res[i][j] != 0) {
					break;
				} else {
					res[i][j] = k;
					k++;
					j--;
				}
			}
			i--;
			j++;
			while (true) {
				if (i == 0 || res[i][j] != 0) {
					break;
				} else {
					res[i][j] = k;
					k++;
					i--;
				}
			}
			i++;
			j++;
		}
		return res;
	}
}
