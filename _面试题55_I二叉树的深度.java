package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/11 上午11:44
 * @Version 1.0
 */
public class _面试题55_I二叉树的深度 {
	public static void main(String[] args) {

	}
	public static int maxDepth(TreeNode root) {
		if (root == null){
			return 0;
		}
		return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
	}
}
