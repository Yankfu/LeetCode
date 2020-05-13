package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0015_三数之和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,0,1,1,2};
		long startTime=System.currentTimeMillis();
		List<List<Integer>> li =threeSum(nums);
		long endTime=System.currentTimeMillis();
		
		int i=1;
		System.out.println(li.size());
		for(List<Integer> lis:li) {
			for(int list:lis) {
				System.out.print(list+"  |  ");
			}
			System.out.println("i:  "+i++);
		}
		System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
	}
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> reasult = new ArrayList<List<Integer>>();
		if(nums.length<3) {
			return reasult;
		}else if(nums.length==3) {
			if(nums[0]+nums[1]+nums[2]==0) {
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(nums[0]);
				temp.add(nums[1]);
				temp.add(nums[2]);
				reasult.add(temp);
				return reasult;
			}else {
				return reasult;
			}
		}
		
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				break;
			}
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			
			int l=i+1;
			int r=nums.length-1;
			while(l<r) {
				if( l>i+1 && nums[l]==nums[l-1] || nums[i]+nums[l]+nums[r]<0 ) {
					l++;
				}else if(r<nums.length-1 && nums[r]==nums[r+1] || nums[i]+nums[r]+nums[l]>0) {
					r--;
				}else {
					List<Integer> temp = new ArrayList<Integer>();
					temp.add(nums[i]);
					temp.add(nums[l++]);
					temp.add(nums[r--]);
					reasult.add(temp);
				}
			}
		}
		return reasult;
    }
}
