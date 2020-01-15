package com.LeetCode;

public class _0674_最长连续递增序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1};
		System.out.println(findLengthOfLCIS(nums));
	}
	public static int findLengthOfLCIS(int[] nums) {
        int res=Integer.MIN_VALUE;
        int[] temp = new int[nums.length];
        temp[0]=1;
		for(int i=1;i<nums.length;i++) {
        	if(nums[i]>nums[i-1]) {
        		temp[i]=temp[i-1]+1;
        	}
        	else {
        		temp[i]=1;
        	}
        }
		for(int i=0;i<temp.length;i++) {
			if(temp[i]>res) {
				res=temp[i];
			}
		}
		return res;
    }
}
