package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0559_N叉树的最大深度 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}