package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/11 上午11:31
 * @Version 1.0
 */
public class _面试题_55_II_平衡二叉树 {
	public static void main(String[] args) {

	}
	public boolean isBalanced(TreeNode root) {
		int res = dfs(root);
		return res != -1;
	}
	public static int dfs(TreeNode root){
		if (root == null) {
			return 1;
		}
		int left = dfs(root.left);
		int right = dfs(root.right);
		if (left == -1 || right == -1){
			return -1;
		}
		int a = Math.abs(left-right);
		if (a == 0 || a == 1){
			return Math.max(left,right)+1;
		}else {
			return -1;
		}
	}
}
