package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/9 下午7:54
 * @Version 1.0
 */
public class _面试题_64 {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(sumNums(n));
	}
	//短路是真的牛批
	public static int sumNums(int n) {
		int res = n;
		boolean b = (n>0) && ((res+=sumNums(n-1))>0);
		return res;
	}
}
