package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/6 下午8:40
 * @Version 1.0
 */
public class _0034_在排序数组中查找元素的第一个和最后一个位置 {
	public static void main(String[] args) {
		int[] nums = {1,4};
		int target = 4;
		_0034_在排序数组中查找元素的第一个和最后一个位置 demo = new _0034_在排序数组中查找元素的第一个和最后一个位置();
		int[] res = demo.searchRange(nums,target);
		System.out.print(res[0]+"  "+res[1]);
	}
	/*
	方法一：
1，二分法找到结果
2，以mid为中心向两边找到边界

方法二：
1，使用二分法判断是否存在目标值
2，使用二分法找到第一个 小于等于 target 的位置
3，使用二分法找到第一个 大于等于 target 的位置
	 */
	public int[] searchRange(int[] nums, int target) {
		int[] res = {-1,-1};
		if (nums.length == 1 && nums[0] == target){
			res[0] = 0;
			res[1] = 0;
			return res;
		}
		int targetIndex = findtarget(nums,target);
		if (targetIndex == -1){
			return res;
		}else{
			res[0] = findMin(nums,target,targetIndex);
			res[1] = findMax(nums,target,targetIndex);
		}
		return res;
	}
	public int findtarget(int[] nums,int target){
		int res = -1;
		int left = 0;
		int right = nums.length-1;
		while (left<=right) {
			int middle = (left+right)/2;
			if (nums[middle] == target){
				return middle;
			}else if (nums[middle]<target){
				left = middle+1;
			} else if (nums[middle]>target) {
				right = middle-1;
			}
		}
		return res;
	}
	public int findMin(int[] nums,int target,int right){
		if (nums[0] == target){
			return 0;
		}
		int res = right;
		int left = 0;
		while (left<=right) {
			int middle = (left+right)/2;
			if (nums[middle] == target){
				right = middle-1;
			}else if (nums[middle]<target && nums[middle+1]<target){
				left = middle+1;
			} else if (nums[middle]<target && nums[middle+1] == target) {
				return middle+1;
			}
		}
		return res;
	}
	public int findMax(int[] nums,int target,int left){
		if (nums[nums.length-1] == target){
			return nums.length-1;
		}
		int res = left;
		int right = nums.length-1;
		while (left<=right) {
			int middle = (left+right)/2;
			if (nums[middle] == target){
				left = middle+1;
			}else if (nums[middle]>target && nums[middle-1]>target){
				right = middle-1;
			} else if (nums[middle]>target && nums[middle-1] == target) {
				return middle-1;
			}
		}
		return res;
	}
}
