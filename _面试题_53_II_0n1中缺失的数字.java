package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/17 下午11:21
 * @Version 1.0
 */
public class _面试题_53_II_0n1中缺失的数字 {
	public static void main(String[] args) {

	}
	public static int missingNumber(int[] nums) {
		int res = -1;
		int left = 0;
		int right = nums.length-1;
		while (left <= right) {
			int mid = left+(right-left)/2;
			if (mid == nums[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return left;
	}
}
