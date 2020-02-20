package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/20 下午8:59
 * @Version 1.0
 */
public class _0198_打家劫舍 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(rob(nums));
	}
	public static int rob(int[] nums) {
		int pre = 0;
		int now = 0;
		for(int a:nums){
			int temp = now;
			now = Math.max(a+pre,now);
			pre = temp;
		}
		return now;
	}
}
