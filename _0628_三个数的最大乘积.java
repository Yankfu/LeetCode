package com.LeetCode;

import java.util.Arrays;

public class _0628_三个数的最大乘积 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0]*nums[1]*nums[nums.length-1];
        int b=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
        if(a>b) {
        	return a;
        }else return b;
        //return nums[0]*nums[1]*nums[nums.length-1]>nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1]?nums[0]*nums[1]*nums[nums.length-1]:nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
    }
}
