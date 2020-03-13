package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/12 上午11:01
 * @Version 1.0
 */
public class _0113_路径总和II {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.right = new TreeNode(2);
		root.left.left.left = new TreeNode(7);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.left.left = new TreeNode(5);
		root.right.left.right = new TreeNode(1);
		List<List<Integer>> li = pathSum(root, 22);
		for (List<Integer> l : li) {
			System.out.println(l);
		}
	}

	static List<List<Integer>> res;

	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		res = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		dfs(root, sum, li);
		return res;
	}

	public static void dfs(TreeNode root, int sum, List<Integer> li) {
		if (root == null) return;
		li.add(root.val);
		if (sum - root.val == 0 && root.left == null && root.right == null)
			res.add(new ArrayList<>(li));
		dfs(root.left, sum - root.val, li);
		dfs(root.right, sum - root.val, li);
		li.remove(li.size() - 1);
	}
}
