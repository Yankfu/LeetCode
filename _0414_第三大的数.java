package com.LeetCode;

import java.util.Arrays;

public class _0414_第三大的数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1};
		System.out.println(thirdMax(nums));
	}
	public static int thirdMax(int[] nums) {
		Arrays.sort(nums);
		int flag=0;
		int reasult=nums[nums.length-1];
		for(int i=nums.length-1;i>=0;i--) {
			if(flag<2 && nums[i]<reasult) {
				reasult=nums[i];
				flag++;
			}
		}
		if(flag==2) return reasult;
		else return nums[nums.length-1];
    }
}
