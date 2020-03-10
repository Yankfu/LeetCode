package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/10 上午10:46
 * @Version 1.0
 */
public class _0543_二叉树的直径 {
	public static void main(String[] args) {

	}
	static int res;
	public static int diameterOfBinaryTree(TreeNode root) {
		res = 0;
		help(root);
		return res;
	}
	public static int help(TreeNode root){
		if(root == null){
			return 0;
		}
		int leftDepth = help(root.left);
		int rigthDepth = help(root.right);
		res = Math.max(res,leftDepth + rigthDepth);
		return Math.max(leftDepth,rigthDepth) + 1;
	}
}
