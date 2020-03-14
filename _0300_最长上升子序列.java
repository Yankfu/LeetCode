package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/14 上午9:46
 * @Version 1.0
 */
public class _0300_最长上升子序列 {
	public static void main(String[] args) {
		int[] nums = {-2,-1};
		System.out.println(lengthOfLIS(nums));
	}
	public static int lengthOfLIS(int[] nums) {
		int res = 0;
		int[] dp = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int big = 1;
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]){
					big = Math.max(dp[j]+1,big);
				}
			}
			dp[i] = big;
		}
		for (int i = 0; i < dp.length; i++) {
			if (dp[i]>res) res = dp[i];
		}
		return res;
	}
}
