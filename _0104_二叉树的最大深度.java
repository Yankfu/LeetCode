package com.LeetCode;

public class _0104_二叉树的最大深度 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = new TreeNode(3);
		head.left=new TreeNode(9);
		head.right=new TreeNode(20);
		head.right.left=new TreeNode(15);
		head.right.right=new TreeNode(7);
		System.out.println(maxDepth(head));
	}
	
	public static int maxDepth(TreeNode root) {
        if(root==null) {
        	return 0;
        }else {
        	int left=maxDepth(root.left);
        	int right=maxDepth(root.right);
        	return java.lang.Math.max(left, right) + 1;
        }
    }
	public static void count(TreeNode root,int count) {

	}
}
