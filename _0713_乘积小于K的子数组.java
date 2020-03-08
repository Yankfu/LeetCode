package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/8 下午12:14
 * @Version 1.0
 */
public class _0713_乘积小于K的子数组 {
	public static void main(String[] args) {
		int[] nums = {10,5,2,6};
		int k = 100;
		System.out.println(numSubarrayProductLessThanK(nums,k));
	}
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		if (k<=1) return 0;
		int res = 0;
		int slow = 0;
		int fast;
		int temp = 1;
		for (fast = 0; fast < nums.length; fast++) {
			temp = temp * nums[fast];
			while (temp>=k){
				temp = temp / nums[slow++];
			}
			res = res + fast - slow + 1;
		}
		return res;
	}
}
