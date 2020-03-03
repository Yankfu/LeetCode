package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/3 下午9:18
 * @Version 1.0
 */
public class _面试题_10_01_合并排序的数组 {
	public static void main(String[] args) {
		int[] A = {1,3,5,0,0,0};
		int[] B = {2,4,6};
		merge(A,3,B,3);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+"  ");
		}
	}
	public static void merge(int[] A, int m, int[] B, int n) {
		for (int i = A.length-1; i >-1 ; i--) {
			if(m>0 && n>0){
				if(A[m-1] >= B[n-1]){
					A[i] = A[m-1];
					m--;
				}else{
					A[i] = B[n-1];
					n--;
				}
			}else if( m > 0){
				A[i] = A[m-1];
				m--;
			}else if( n > 0){
				A[i] = B[n-1];
				n--;
			}
		}
	}
}
