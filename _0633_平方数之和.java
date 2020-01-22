package com.LeetCode;

public class _0633_平方数之和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(judgeSquareSum(2));
	}
	//
	public static boolean judgeSquareSum(int c) {
		if(c==0) {
			return true;
		}
		int a = (int) (Math.sqrt(c));
		//System.out.println(a);
		for(int i=1;i<=a;i++) {
			if(Math.sqrt(c-i*i)==(int)Math.sqrt(c-i*i))
			{
				return true;
			}
		}
		return false;
    }
}
