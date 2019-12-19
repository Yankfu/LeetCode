package com.LeetCode;

public class _0191_位1的个数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
