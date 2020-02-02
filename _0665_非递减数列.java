package com.LeetCode;

public class _0665_非递减数列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,3,2,4};
		System.out.println(checkPossibility(nums));
	}

	public static boolean checkPossibility(int[] nums) {
		if (nums.length <= 2) {
			return true;
		}
		int count = 0;
		for(int i = 0;i<nums.length-1;i++) {
			if(i==0 && nums[0]>nums[1]) {
				nums[0]=nums[1];
				count++;
			}else if(i>0 && nums[i]>nums[i+1]) {
				int temp = nums[i];
				nums[i] = nums[i-1];
				if(nums[i]>nums[i+1]) {
					nums[i] = temp;
					nums[i+1] = nums[i];
				}
				count++;
			}
			if(count == 2) {
				return false;
			}
		}
		return true;
	}
}
