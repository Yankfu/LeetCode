package com.LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0513_找树左下角的值 {
    public static void main(String[] args) {

    }
    public static int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int res = 0;
        queue.offer(root);
        while (!queue.isEmpty()){
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                TreeNode cur = queue.poll();
                if (i == 0) res = cur.val;
                if (cur.left!=null) queue.offer(cur.left);
                if (cur.right!=null) queue.offer(cur.right);
            }
        }
        return res;
    }
}
