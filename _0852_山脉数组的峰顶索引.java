package com.LeetCode;

public class _0852_山脉数组的峰顶索引 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0,2,10,0};
		System.out.println(peakIndexInMountainArray(A));
	}
	public static int peakIndexInMountainArray(int[] A) {
        int reasult=0;
		int big=-1;
        for(int i=0;i<A.length;i++) {
        	if(A[i]>big) {
        		big=A[i];
        		reasult=i;
        	}
        }
		
		return reasult;
    }
}
