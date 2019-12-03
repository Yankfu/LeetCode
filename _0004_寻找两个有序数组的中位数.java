package com.LeetCode;

public class _0004_寻找两个有序数组的中位数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2};
		int[] b= {3,4};
		System.out.println(findMedianSortedArrays(a,b));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double result=0;
		int length=nums1.length+nums2.length;
		int num1Point=0;
		int num2Point=0;
		int count=0;
		if(length%2==1)
		{
			
		}
		else
		{
			while(count!=(length/2))
			{
				if(nums1[num1Point]>=nums2[num2Point])
				{
					num2Point++;
					count++;
				}
				{
					num1Point++;
					count++;
				}
			}
		}
		result=count;
		return result;
    }
}
