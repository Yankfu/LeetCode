package com.LeetCode;

import java.util.Arrays;

public class _0088_合并两个有序数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {2,0};
		int m=1;
		int[] nums2= {1};
		int n=1;
		merge(nums1,m,nums2,n);
		for(int a:nums1) {
			System.out.print(a+" ");
		}
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
