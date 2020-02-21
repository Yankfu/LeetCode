package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/21 上午11:22
 * @Version 1.0
 */
public class _0053_最大子序和 {
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.print(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		int n = nums.length;
		int currSum = nums[0], maxSum = nums[0];

		for(int i = 1; i < n; ++i) {
			currSum = Math.max(nums[i], currSum + nums[i]);
			maxSum = Math.max(maxSum, currSum);
			System.out.println(nums[i]+"  "+currSum+"  "+maxSum);
		}
		return maxSum;
	}
}