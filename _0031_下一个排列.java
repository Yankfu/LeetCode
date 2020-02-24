package com.LeetCode;

import java.util.Arrays;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/24 下午8:43
 * @Version 1.0
 */
public class _0031_下一个排列 {
	public static void main(String[] args) {
		int[] nums = {3,2,1};
//		nextPermutation(nums);
		nextPermutation(nums);
		for(int a:nums){
			System.out.print(a+" ");
		}
	}
	public static void nextPermutation(int[] nums) {
		int fast = nums.length-1;
		while(fast >= 1 && nums[fast]<=nums[fast-1]){
			fast--;
		}
//		System.out.println(fast);
		if(fast == 0){
			Arrays.sort(nums);
			return;
		}else {
			int slow = fast;
			while(slow<nums.length && nums[slow]>nums[fast-1]){
				slow++;
			}
			slow--;
//			System.out.println(nums[slow]);
			if(slow<nums.length){
				int temp = nums[fast-1];
				nums[fast-1] = nums[slow];
				nums[slow] = temp;
				sortNums(nums,fast);
			}
		}
	}
	public static void sortNums(int[] nums,int point){
		for(int i=point;i<nums.length-1;i++)
		{
			for(int j=point;j<nums.length-1;j++)
			{
				if(nums[j]>nums[j+1])
				{
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
	}
}
