package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/11 下午11:30
 * @Version 1.0
 */
public class _0872_叶子相似的树 {
	public static void main(String[] args) {

	}
	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> li1 = new ArrayList<>();
		List<Integer> li2 = new ArrayList<>();
		help(root1,li1);
		help(root2,li2);
		return li1.equals(li2);
	}
	public static void help(TreeNode root,List<Integer> li){
		if (root.left==null && root.right == null){
			li.add(root.val);
			return;
		}
		if (root.left != null) help(root.left,li);
		if (root.right != null) help(root.right,li);
	}
}
