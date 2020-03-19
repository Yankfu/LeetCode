package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0229_求众数Ⅱ{

	public void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,2,3};
		System.out.println(majorityElement(nums));
	}

	public List<Integer> majorityElement(int[] nums) {
		int count_1;
		int count_2;
		int result_1=0;
		int result_2=0;
		List<Integer> ret = new ArrayList<>();
		if (nums.length>=1) {
			result_1=nums[0];
			result_2=nums[0];
			count_1=0;
			count_2=0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == result_1) {
					count_1++;
				} else if (nums[i] == result_2) {
					count_2++;
				} else if (count_1 == 0) {
					result_1 = nums[i];
					count_1 = 1;
				} else if (count_2 == 0) {
					result_2 = nums[i];
					count_2 = 1;
				} else{
					count_1--;
					count_2--;
				}
			}
			count_1=0;
			count_2=0;
			for(int i=0;i<nums.length;i++)
			{
				if(result_1==nums[i])
				{
					count_1++;
				}
				if(result_2==nums[i])
				{
					count_2++;
				}
			}
			if(count_1>nums.length/3)
			{
				ret.add(result_1);
			}
			if(result_1!=result_2 && count_2>nums.length/3)
			{
				ret.add(result_2);
			}
			return ret;
		}
		else
		{
			return ret;
		}
	}
}