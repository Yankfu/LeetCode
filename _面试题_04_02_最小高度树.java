package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/11 下午10:57
 * @Version 1.0
 */
public class _面试题_04_02_最小高度树 {
	public static void man(String[] args) {
		int[] nums = {-10,-3,0,5,9};
	}
	public static TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) return null;
		return help(nums,0,nums.length-1);
	}
	public static TreeNode help(int[] nums, int left,int right){
		if (left == right){
			return new TreeNode(nums[left]);
		}
		int mid = (left + right) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		if (mid == left){
			root.right = new TreeNode(nums[right]);
			return root;
		}
		root.left = help(nums,left,mid-1);
		root.right = help(nums,mid+1,right);
		return root;
	}
}
