package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/27 下午10:25
 * @Version 1.0
 */
public class _0081_搜索旋转排序数组II {
	public static void main(String[] args) {
		int[] nums = {2,5,6,0,0,1,2};
		int target = 3;
		System.out.print(search(nums,target));
	}
	//直接交就行，AC的
	public static boolean search(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		int mid = low+(high-low)/2;
		while(low<=high){
			if(nums[mid] == target){
				return true;
			}
			if (nums[low] == nums[mid]) {
				low++;
				continue;
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
		return false;
	}
}
