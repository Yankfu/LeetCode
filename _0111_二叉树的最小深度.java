package com.LeetCode;

public class _0111_二叉树的最小深度 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = new TreeNode(3);
		head.left=new TreeNode(9);
//		head.right=new TreeNode(20);
//		head.right.left=new TreeNode(15);
//		head.right.right=new TreeNode(7);
		System.out.println(minDepth(head));
	}
	public static int minDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
        if(root.right==null && root.left==null) {
        	return 1;
        }
        if(root.right==null) {
        	return minDepth(root.left)+1;
        }else if(root.left==null) {
        	return minDepth(root.right)+1;
        }
		return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }
}
