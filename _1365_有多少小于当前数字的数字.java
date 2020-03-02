package com.LeetCode;

import java.util.Arrays;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/1 上午10:30
 * @Version 1.0
 */
public class _1365_有多少小于当前数字的数字 {
	public static void main(String[] args) {
		int[] nums = {0,0,5,6,10,10};
		int[] res = smallerNumbersThanCurrent(nums);
		for(int a:res){
			System.out.print(a+" ");
		}
	}
	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] res = nums.clone();
		int[] res2 = new int[nums.length];
		Arrays.sort(nums);
		int big = 0;
		for (int i = 0; i < nums.length; i++) {
			if(i>0 && nums[i] == nums[i-1]){
				big++;
				continue;
			}
			for (int j = 0; j < nums.length; j++) {
				if(res[j] == nums[i]){
					res2[j] = big;
				}
			}
			big++;
		}
		return res2;
	}
}
