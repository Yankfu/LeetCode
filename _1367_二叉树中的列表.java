package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/1 上午11:03
 * @Version 1.0
 */
public class _1367_二叉树中的列表 {
	public static void main(String[] args) {
		CreateNode cn = new CreateNode();
		int[] nums = {1,4,2,6};
		ListNode head = cn.createListNode(nums);
		int[] pre = {1,4,2,1,4,2,6,8,1,3};
		int[] in = {4,1,2,1,6,2,1,8,3,4};
		CreateTree ct = new CreateTree();
		TreeNode root = ct.buildTreePI(pre,in);
		System.out.println(isSubPath(head,root));
	}
	public static boolean isSubPath(ListNode head, TreeNode root) {

		return true;
	}
}
