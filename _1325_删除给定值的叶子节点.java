package com.LeetCode;

public class _1325_删除给定值的叶子节点 {
	
	//下次记得写个生成树的函数，直接调用，这样生成太麻烦了
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode nhead = new TreeNode(0);
		TreeNode head = new TreeNode(2);
		head.left = new TreeNode(2);
		head.left.left = new TreeNode(2);
		head.left.left.left = new TreeNode(2);
		nhead=removeLeafNodes(head,2);
		System.out.println(nhead.val);
		System.out.println(nhead.left.val);
		System.out.println(nhead.left.left.val);
		System.out.println(nhead.left.left.left.val);
	}
	
	public static TreeNode removeLeafNodes(TreeNode root, int target) {
		if(root.left!=null) {
			root.left=removeLeafNodes(root.left,target);
		}
		if(root.right!=null) {
			root.right=removeLeafNodes(root.right,target);
		}
		if(root.left==null && root.right==null && root.val==target) {
			return null;
		}
		return root;
    }
}
