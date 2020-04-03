package com.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0429_N叉树的层序遍历 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int leave = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            res.add(new ArrayList<>());
            for (int i = 0; i < length; i++) {
                Node temp = queue.remove();
                res.get(leave).add(temp.val);
                for (int j = 0; j < temp.children.size(); j++) {
                    queue.add(temp.children.get(j));
                }
            }
            leave++;
        }
        return res;
    }

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
}
