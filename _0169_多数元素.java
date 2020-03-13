package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/13 上午11:04
 * @Version 1.0
 */
public class _0169_多数元素 {
	public static void main(String[] args) {

	}
	public static int majorityElement(int[] nums) {
		int res = nums[0];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == res) {
				count++;
			}else {
				count--;
			}
			if (count == 0) res = nums[i+1];
		}
		return res;
	}
}
