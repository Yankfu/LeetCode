package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/27 下午9:16
 * @Version 1.0
 */
public class _0215_数组中的第K个最大元素 {
	public static void main(String[] args) {
		int[] nums = {9,2,7,4,5,6,3,8,1};
		System.out.println(findKthLargest(nums,4));
	}
	public static int findKthLargest(int[] nums, int k) {
		int res = k;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length-i; j++) {
				if(nums[j-1]>nums[j]){
					int temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
				}
			}
			res--;
			if(res==0){
				break;
			}
		}
		return nums[nums.length-k];
	}
}
