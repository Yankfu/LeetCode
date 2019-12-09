package com.LeetCode;

public class _0867_转置矩阵{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = { {1}};
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j]);
			}
			System.out.println();
		}
		
		int[][] B =transpose(A);
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] transpose(int[][] A) {
		int[][] B = new int[A[0].length][A.length];

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				B[i][j]=A[j][i];
			}
		}
		return B;
	}
}
