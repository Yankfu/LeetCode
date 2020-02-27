package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/27 下午9:53
 * @Version 1.0
 */
public class _0033_搜索旋转排序数组 {
	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};
		System.out.println(search(nums,0));
	}
	public static int search(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		int mid = low+(high-low)/2;
		while(low<=high){
			if(nums[mid] == target){
				return mid;
			}
			if(nums[low]<=nums[mid]){  //第一种情况，旋转的过半了
				if(target>=nums[low] && target<=nums[mid]){ //在左边找
					high = mid-1;
				}else{
					low = mid+1;
				}
			}else {
				if(target<=nums[high] && target>=nums[mid]){//在右边找
					low = mid+1;
				}else{
					high = mid-1;
				}
			}
			mid = low + (high-low)/2;
		}
		return -1;
	}
}
