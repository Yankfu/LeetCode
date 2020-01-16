package com.LeetCode;

public class _0704_二分查找 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1};
		int target = -1;
		System.out.println(search(nums,target));
	}
	public static int search(int[] nums, int target) {
		int high=nums.length-1;
		int low=0;
		int mid=(high+low)/2;
		while(low<=high) {
			if(nums[mid]==target) {
				return mid;
			}else if(nums[mid]>target) {
				high=mid-1;
				mid = (low+high)/2;
			}else if(nums[mid]<target) {
				low=mid+1;
				mid = (low+high)/2;
			}
		}
		return -1;
    }
}
