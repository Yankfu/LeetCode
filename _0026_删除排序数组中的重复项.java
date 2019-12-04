package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0026_删除排序数组中的重复项 {

	private static int[] a= {0,0,1,1,1,2,2,3,3,4};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(removeDuplicates(a));
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	public static int removeDuplicates(int[] nums) {
        int count=1;
        List<Integer> li = new ArrayList<Integer>();
        int temp=nums[0];
        li.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
        	if(temp==nums[i])
        	{
        		
        	}
        	else
        	{
        		count++;
        		temp=nums[i];
        		li.add(nums[i]);
        	}
        }
        for(int i=0;i<li.size();i++)
        {
        	nums[i]=li.get(i);
        }
		return count;
    }
}
