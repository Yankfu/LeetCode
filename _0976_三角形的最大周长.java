package com.LeetCode;

import java.util.Arrays;

public class _0976_三角形的最大周长 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 3; i >= 0; --i)
            if (A[i] + A[i+1] > A[i+2])
                return A[i] + A[i+1] + A[i+2];
        return 0;
    }
}
    
