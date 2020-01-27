package com.LeetCode;

public class _0190_颠倒二进制位 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int res = 0;
        int temp = 0;
        for(int i=0;i<32;i++) {
        	temp=(n & 1);
        	n = n>>>1;
        	res = res << 1;
        	if(temp == 1) {
        		res=res | 1;
        	}else if(temp == 0) {
        		res = res | 0;
        	}
        }
    	return res;
    }
}
