package com.LeetCode;

public class _0100_相同的树 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = new TreeNode(1);
		head.left=new TreeNode(2);
		head.right=new TreeNode(3);
		TreeNode head2 =head;
		System.out.println(isSameTree(head,head2));
	}
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
        	return true;
        }
        
        if(p==null || q==null) {
        	return false;
        }
        
        if(p.val!=q.val) {
        	return false;
        }
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }
}
