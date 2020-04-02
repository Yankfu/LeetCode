package com.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0515_在每个树行中找最大值 {
    public static void main(String[] args) {

    }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int leave = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            int biggest = Integer.MIN_VALUE;
            for (int i = 0; i < length; i++) {
                TreeNode temp = queue.remove();
                if (temp.val>biggest) biggest = temp.val;
                if (temp.left!=null) queue.add(temp.left);
                if (temp.right!=null) queue.add(temp.right);
            }
            list.add(biggest);
            leave++;
        }
        return list;
    }
}
