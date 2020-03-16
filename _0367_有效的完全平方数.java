package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/16 下午8:01
 * @Version 1.0
 */
public class _0367_有效的完全平方数 {
	public static void main(String[] args) {
		int num = 808201;
		System.out.println(isPerfectSquare(num));
	}
	public static boolean isPerfectSquare(int num) {
		if (num<2) return true;
		long left = 2;
		long right = num/2;
		while(left <= right) {
			long mid = left + (right - left)/2;
			long res = mid * mid;
			if (res == (long)num) return true;
			else if (res < (long)num) {
				left = mid + 1;
			} else if (res > (long)num) {
				right = mid - 1;
			}
		}
		return false;
	}
}
