package com.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0103_二叉树的锯齿形层次遍历 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int leave = 0;
        boolean zheng = true;
        while (!queue.isEmpty()) {
            int length = queue.size();
            res.add(new ArrayList<>());
            int[] resTemp = new int[length];
            int index = 0;
            for (int i = 0; i < length; i++) {
                TreeNode temp = queue.remove();
                resTemp[index++] = temp.val;
                if (temp.left!=null) queue.add(temp.left);
                if (temp.right!=null) queue.add(temp.right);
            }
            if (zheng){
                for (int i = 0; i < length; i++) {
                    res.get(leave).add(resTemp[i]);
                }
                zheng = false;
            }else if (!zheng) {
                for (int i = length-1; i >= 0; i--) {
                    res.get(leave).add(resTemp[i]);
                }
                zheng = true;
            }
            leave++;
        }
        return res;
    }
}
