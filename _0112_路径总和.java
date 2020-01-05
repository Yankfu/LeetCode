package com.LeetCode;

public class _0112_路径总和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
		      return false;
		sum=sum-root.val;
		if ((root.left == null) && (root.right == null))
		      return (sum == 0);
		return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
}
