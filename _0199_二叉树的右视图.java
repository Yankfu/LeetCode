package com.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0199_二叉树的右视图 {
    public static void main(String[] args) {

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int leave = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            TreeNode temp = null;
            for (int i = 0; i < length; i++) {
                temp = queue.remove();
                if (temp.left!=null) queue.add(temp.left);
                if (temp.right!=null) queue.add(temp.right);
            }
            res.add(temp.val);
            leave++;
        }
        return res;
    }
}
