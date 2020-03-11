package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/11 上午11:01
 * @Version 1.0
 */
public class _1013_将数组分成和相等的三个部分 {
	public static void main(String[] args) {
		int[] A = {10,-10,10,-10,10,-10};
		System.out.println(canThreePartsEqualSum(A));
	}
	public static boolean canThreePartsEqualSum(int[] A) {
		int total = 0;
		for (int i = 0; i < A.length; i++) {
			total += A[i];
		}
		if (total%3 != 0) return false;
		int temp = 0;
		System.out.println(total);
		total = total/3;
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0; i < A.length; i++) {
			temp += A[i];
			if (!flag1 && temp == total) {
				flag1 = true;
			} else if (flag1 && temp == total*2 && i!=A.length-1) {
				flag2 = true;
				break;
			}
		}
		return flag1&&flag2;
	}
}
