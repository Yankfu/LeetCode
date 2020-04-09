package com.LeetCode;

public class _0371_两整数之和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(((13&6)<<1));
	}
	public int getSum(int a, int b) {
		while(b != 0){
			int temp = a ^ b;
			b = (a & b) << 1;
			a = temp;
		}
		return a;
	}
}