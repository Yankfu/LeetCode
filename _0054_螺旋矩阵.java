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
			List res = new ArrayList();
			return res;
		}
		if(matrix.length==1) {
			List res = new ArrayList();
			for(int a:matrix[0]) {
				res.add(a);
			}
			return res;
		}
		int i=0;
		int j=0;
		List li = new ArrayList();
		while(true) {
			if((j>=matrix[0].length || i>=matrix.length || j<0 || i<0) || matrix[i][j]==Integer.MIN_VALUE) {
				break;
			}
			while(true) {
				if(j==matrix[0].length || matrix[i][j]==Integer.MIN_VALUE ) {
					break;
				}else {
					//System.out.println(i+"  "+j);
					li.add(matrix[i][j]);
					matrix[i][j]=Integer.MIN_VALUE;
					j++;
				}
			}
			j--;
			i++;
//			System.out.println(i+"  "+j);
			while(true) {
				if(i==matrix.length || matrix[i][j]==Integer.MIN_VALUE ) {
					break;
				}else {
					li.add(matrix[i][j]);
					matrix[i][j]=Integer.MIN_VALUE;
					i++;
				}
			}
			i--;
			j--;
			while(true) {
				if(j==-1 || matrix[i][j]==Integer.MIN_VALUE ) {
					break;
				}else {
					li.add(matrix[i][j]);
					matrix[i][j]=Integer.MIN_VALUE;
					j--;
				}
			}
			i--;
			j++;
			while(true) {
				if(i==0 || matrix[i][j]==Integer.MIN_VALUE ) {
					break;
				}else {
					li.add(matrix[i][j]);
					matrix[i][j]=Integer.MIN_VALUE;
					i--;
				}
			}
			i++;
			j++;
		}
//		for(i=0;i<matrix.length;i++) {
//			for(j=0;j<matrix.length;j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
		return li;
    }
}
