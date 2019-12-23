package com.LeetCode;

public class _0101_对称二叉树 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = new TreeNode(3);
		head.left=new TreeNode(9);
		head.right=new TreeNode(9);
		head.right.left=new TreeNode(15);
		head.right.right=new TreeNode(7);
		head.left.right=new TreeNode(15);
		head.left.left=new TreeNode(7);
		System.out.println(isSymmetric(head));
	}
	public static boolean isSymmetric(TreeNode root) {
		return isTest(root,root);
    }
	public static boolean isTest(TreeNode left,TreeNode right) {
		if(right==null && left==null) return true;
		if(right==null || left==null) return false;
		return (right.val==left.val) && isTest(left.right,right.left) && isTest(left.left,right.right);
	}
}
