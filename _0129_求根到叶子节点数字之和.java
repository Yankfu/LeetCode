package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/13 下午12:18
 * @Version 1.0
 */
public class _0129_求根到叶子节点数字之和 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(9);
		root.right = new TreeNode(0);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(1);
		System.out.println(sumNumbers(root));
	}

	static int res = 0;

	public static int sumNumbers(TreeNode root) {
		dfs(root, 0);
		return res;
	}

	public static void dfs(TreeNode root, int num) {
		if (root == null) {
			return;
		}
		num = num * 10 + root.val;
		if (root.left == null && root.right == null)
			res += num;
		dfs(root.left, num);
		dfs(root.right, num);
		num = num / 10;
	}
}
