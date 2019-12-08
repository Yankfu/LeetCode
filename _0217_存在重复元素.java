package com.LeetCode;

import java.util.Arrays;

public class _0217_存在重复元素 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,3};
		System.out.println(containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; ++i) {
			if (nums[i] == nums[i + 1])
				return true;
		}
		return false;
	}
}
