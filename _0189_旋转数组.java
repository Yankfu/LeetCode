package com.LeetCode;

public class _0189_旋转数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5};
		rotate(nums,3);
		for(int a:nums) {
			System.out.print(a+" ");
		}
	}
	public static void rotate(int[] nums, int k) {
        for (int j = 0; j < k; j++) {
			int temp = nums[nums.length - 1];
			for (int i = nums.length - 1; i > 0; i--) {
				nums[i] = nums[i - 1];
			}
			nums[0] = temp;
		}
    }
}
