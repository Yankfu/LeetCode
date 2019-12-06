package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0027_ÒÆ³ıÔªËØ {
	public static int[] nums = {2,3,3,2};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeElement(nums,3));
		for(int i=0;i<removeElement(nums,3);i++)
		{
			System.out.println(nums[i]);
		}
	}

	public static int removeElement(int[] nums, int val) {
        List<Integer> li = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
        	if(nums[i]!=val) {
        		li.add(nums[i]);
        	}
        	else {
        		
        	}
        }
        for(int i=0;i<li.size();i++)
        {
        	nums[i]=li.get(i);
        }
		return li.size();
    }
}
