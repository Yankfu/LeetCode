package com.LeetCode;

import java.util.*;

public class _0102_二叉树的层序遍历 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int leave = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            res.add(new ArrayList<>());
            for (int i = 0; i < length; i++) {
                TreeNode temp = queue.remove();
                res.get(leave).add(temp.val);
                if (temp.left!=null) queue.add(temp.left);
                if (temp.right!=null) queue.add(temp.right);
            }
            leave++;
        }
        return res;
    }
}
