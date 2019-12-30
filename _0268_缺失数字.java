package com.LeetCode;

import java.util.Arrays;

public class _0268_缺失数字 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=0){
        	return 0;
        }
        if(nums[nums.length-1]!=nums.length) {
        	return nums.length;
        }
        for (int i = 1; i < nums.length; i++) {
            int expectedNum = nums[i-1] + 1;
            if (nums[i] != expectedNum) {
                return expectedNum;
            }
        }
        return -1;
    }
}
