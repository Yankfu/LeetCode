package com.LeetCode;

public class _0665_非递减数列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,2,3};
		System.out.println(checkPossibility(nums));
	}
	public static boolean checkPossibility(int[] nums) {
		if(nums.length<=2) {
			return true;
		}
        int flag1=0;
        for(int i=1;i<nums.length;i++) {
        	System.out.println(nums[i]+" "+flag1);
        	if(nums[i]<nums[i-1] && flag1==0) {
        		nums[i]=nums[i-1];
        		flag1=1;
        		continue;
        	}else if(nums[i]<nums[i-1] && flag1==1) {
        		return false;
        	}else {
        		continue;
        	}
        }
		return true;
    }
}
