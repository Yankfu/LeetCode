package com.LeetCode;

public class _0941_有效的山脉数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {7,3,2};
		System.out.println(validMountainArray(A));
	}

	public static boolean validMountainArray(int[] A) {
		boolean a = true;
		boolean b = false;
		int big = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i]>big) {
				big = A[i];
				index = i;
			}
		}
		if(index == 0 || index == A.length-1) {
			return false;
		}
		//System.out.println("index: "+index+" big: "+big);
		for(int i=1;i<=index;i++) {
			//System.out.println(A[i]+"  "+A[i-1]);
			if(A[i]<=A[i-1]) {
				return false;
			}
		}
		//System.out.println("aaaaa");		
		for(int i=index+1;i<A.length;i++) {
			//System.out.println(A[i]+"  "+A[i-1]);
			if(A[i]>=A[i-1]) {
				return false;
			}
		}
		return true;
	}
}
