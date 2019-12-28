package com.LeetCode;

import java.util.Stack;

public class _0496_下一个更大元素I{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {4,1,2};
		int[] nums2= {1,3,4,2};
		int[] nums3=nextGreaterElement(nums1,nums2);
		for(int num:nums3)
		{
			System.out.print(num+" ");
		}
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length];
		
		for(int i=0;i<nums1.length;i++) {
			int flag=0;
			for(int j=0;j<nums2.length;j++) {
				if(nums2[j]==nums1[i]) {
					flag=1;
				}else if(nums2[j]!=nums1[i] && flag==0) {
					continue;
				}
				if(nums2[j]>nums1[i] && flag==1) {
					result[i]=nums2[j];
					break;
				}
			}
		}
		for(int i=0;i<nums1.length;i++) {
			if(result[i]==0) {
				result[i]=-1;
			}
		}
		return result;
    }
}
