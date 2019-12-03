package com.LeetCode;

public class _0908_×îÐ¡²îÖµI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,3,6};
		int K=3;
		System.out.println(smallestRangeI(A, K));
	}

	public static int smallestRangeI(int[] A, int K) {
        int result=0;
        int max=0;
        int min=10000;
        for(int i:A)
        {
        	max=i>max?i:max;
        	min=i<min?i:min;
        }
        if(min+K<max-K)
        {
        	result=max-K-min-K;
        }
        else result=0;
		return result;
    }
}
