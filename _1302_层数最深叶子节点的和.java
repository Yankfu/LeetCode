package com.LeetCode;

public class _1302_层数最深叶子节点的和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root =new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
//		root.left.left=new TreeNode(4);
//		root.left.right=new TreeNode(5);
//		root.right.right=new TreeNode(6);
//		root.left.left.left=new TreeNode(7);
//		root.right.right.right=new TreeNode(8);
		System.out.println(deepestLeavesSum(root));
	}
	static int deep;
	public static int deepestLeavesSum(TreeNode root) {
		deep=maxDepth(root);
		if(deep==1) {
			return root.val;
		}
		return doSomething(root,1);
    }
	
	public static int doSomething(TreeNode root,int now) {
		
		if(now == deep && root!=null) {
			//System.out.println(root.val);
			return root.val;
		}else if(now == deep && root == null) {
			return 0;
		}
		if(root==null && now!=deep) {
			//System.out.println("now:+"+now);
			return 0;
		}
		int left=0;
		int right=0;
		left=doSomething(root.left,now+1);
		right=doSomething(root.right,now+1);
		//System.out.println(left+"  "+right);
		return left+right;
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
}
