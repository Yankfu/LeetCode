package com.LeetCode;

public class _0098_验证二叉搜索树 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head1 = new TreeNode(5);
		head1.left=new TreeNode(1);
		head1.right=new TreeNode(4);
		head1.right.left=new TreeNode(3);
		head1.right.right=new TreeNode(6);
		
		TreeNode head2 = new TreeNode(2);
		head2.left=new TreeNode(1);
		head2.right=new TreeNode(3);
		System.out.println(isValidBST(head2));
	}
	public static boolean isValidBST(TreeNode root) {
		return helpTree(root,null,null);
    }
	
	public static boolean helpTree(TreeNode root,Integer high,Integer low) {
		
		if(root == null) {
			return true;
		}
		int now=root.val;
		if(high!=null && high>=now) {
			return false;
		}
		if(low!=null && low<=now) {
			return false;
		}
		
		if(!helpTree(root.left,high,now)) {
			return false;
		}
		if(!helpTree(root.right,now,low)) {
			return false;
		}
		
		return true;
	}
}
