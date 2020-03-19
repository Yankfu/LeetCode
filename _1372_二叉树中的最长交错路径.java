package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/19 下午9:44
 * @Version 1.0
 */
public class _1372_二叉树中的最长交错路径 {
	public static void main(String[] args) {

	}
	int res = 0;
	public int longestZigZag(TreeNode root) {
		if (root == null){
			return 0;
		}
		help(0,true,root.left);
		help(0,false,root.right);
		return res;
	}
	public void help(int father,boolean isLeft,TreeNode root){
		if (root == null){
			if (father>res){
				res = father;
			}
			return ;
		}else{
			if (isLeft){
				help(0,true,root.left);
				help(father+1,false,root.right);
			}else if (!isLeft){
				help(father+1,true,root.left);
				help(0,false,root.right);
			}
		}
	}
}
