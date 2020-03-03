package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/3 下午10:12
 * @Version 1.0
 */
public class _0589_N叉树的前序遍历 {
	public static void main(String[] args) {

	}
	List<Integer> res = new ArrayList<>();
	public List<Integer> preorder(Node root) {
		help(root);
		return res;
	}
	public void help(Node root){
		if(root == null){
			return;
		}
		res.add(root.val);
		for (int i = 0; i < root.children.size(); i++) {
			help(root.children.get(i));
		}
	}
}
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/