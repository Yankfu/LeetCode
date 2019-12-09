package com.LeetCode;

import java.util.Stack;

public class _0496_下一个更大元素I{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {2,4};
		int[] nums2= {1,2,3,4};
		int[] nums3=nextGreaterElement(nums1,nums2);
		for(int num:nums3)
		{
			System.out.print(num+" ");
		}
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] num3=new int[nums1.length];
		Stack<Integer> s=new Stack<>();
		int k=0;
		for(int i:nums2)
		{
			s.push(i);
		}
		//��һ��ѭ����¼�±�
		for(int i:nums1)
		{
			for(int j=0;j<nums2.length;j++)
			{
				if(i==nums2[j])
				{
					num3[k++]=j;
				}
			}
		}
		for(int i:num3)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<num3.length;i++)
		{
			if(num3[i]+1==nums2.length)
			{
				num3[i]=-1;
			}
			for(int j=num3[i]+1;j<nums2.length;j++)
			{
				if(nums2[j]>nums2[num3[i]])
				{
					num3[i]=nums2[j];
					break;
				}
				if(j==nums2.length-1 && nums2[nums2.length-1]<nums2[num3[i]])
				{
					System.out.println(66666);
					num3[i]=-1;
				}
			}
		}
		return num3;
    }
}
