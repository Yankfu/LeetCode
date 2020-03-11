package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/11 下午11:39
 * @Version 1.0
 */
public class _0897_递增顺序查找树 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left =  new TreeNode(3);
		root.right = new TreeNode(6);
		root.left.left =  new TreeNode(2);
		root.left.right =  new TreeNode(4);
		root.left.left.left = new TreeNode(1);
		root.right.right = new TreeNode(8);
		root.right.right.left = new TreeNode(7);
		root.right.right.right =  new TreeNode(9);
		TreeNode res = increasingBST(root);
		System.out.println(res.val);
		while (res != null){
			System.out.print(res.val+" ");
			res = res.right;
		}
	}
	public static TreeNode increasingBST(TreeNode root) {
		List<Integer> li = new ArrayList<>();
		help(root,li);
		TreeNode ans = new TreeNode(0), cur = ans;
		for (int v: li) {
			cur.right = new TreeNode(v);
			cur = cur.right;
		}
		return ans.right;
	}
	public static void help(TreeNode root,List li){
		if (root.left == null && root.right == null){
			li.add(root.val);
			return;
		}
		if (root.left != null) {
			help(root.left,li);
		}
		li.add(root.val);
		if (root.right != null) {
			help(root.right,li);
		}
	}
}
