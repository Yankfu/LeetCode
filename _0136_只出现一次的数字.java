package com.LeetCode;

public class _0136_只出现一次的数字 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,2,1};
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
            }
        }
        return ans;
    }
}
