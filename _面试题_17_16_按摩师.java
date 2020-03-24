package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/24 上午8:39
 * @Version 1.0
 */
public class _面试题_17_16_按摩师 {
	public int massage(int[] nums) {
		int res = 0;
		int pre_1 = 0;
		int pre_2 = 0;
		for (int i = 0; i < nums.length; i++) {
			res = Math.max(pre_1,pre_2+nums[i]);
			pre_2 = pre_1;
			pre_1 = res;
		}
		return res;
	}
}
