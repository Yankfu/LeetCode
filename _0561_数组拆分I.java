package com.LeetCode;

import java.util.Arrays;

public class _0561_Êý×é²ð·ÖI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,4,3,2};
		System.out.println(arrayPairSum(nums));
	}

	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int i = 0;
		int result = 0;
		while (i < nums.length) {
			result += nums[i];
			i = i + 2;
		}
		return result;
	}
}
