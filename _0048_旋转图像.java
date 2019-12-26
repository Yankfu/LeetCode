package com.LeetCode;

public class _0048_旋转图像 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix ={
		               };
		rotate(matrix);
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println();
		}
	}
	public static void rotate(int[][] matrix) {
		if(matrix.length<=1) {
			return;
		}
        int[][] temp =new int[matrix.length][matrix.length];
		for(int i=0;i<matrix.length;i++) {
        	for(int j=0;j<matrix.length;j++) {
        		//System.out.print(matrix[i][j]+"i:"+i+"j:"+j+"     ");
        		temp[j][matrix.length-i-1]=matrix[i][j];
        	}
        	//System.out.println();
        }
		//System.out.println("------------------");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				matrix[i][j]=temp[i][j];
			}
		}
    }
}
