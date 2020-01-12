package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0054_螺旋矩阵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> li = spiralOrder(matrix);
		for(Integer a:li) {
			System.out.print(a+" ");
		}
	}
	public static List<Integer> spiralOrder(int[][] matrix) {
		if(matrix.length==0) {
			return null;
		}
		int i=0;
		int j=0;
		List li = new ArrayList();
		while(true) {
			if(matrix[0].length==1 || matrix[i+1][j]==0) {
				break;
			}
			while(i<matrix[0].length && matrix[i+1][j]!=0) { //top
				li.add(matrix[i][j]);
				matrix[i][j]=0;
				i++;
				continue;
			}
			j++;
			while(j<matrix.length && matrix[i][j+1]!=0) {//right
				
			}
			while(j<matrix.length && matrix[i][j+1]!=0) {//button
				
			}
			while(j<matrix.length && matrix[i][j+1]!=0) {//left
	
			}
			break;
		}
		return null;
    }
}
