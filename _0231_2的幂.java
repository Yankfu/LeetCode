package com.LeetCode;

public class _0231_2的幂{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
