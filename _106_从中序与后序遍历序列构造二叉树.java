package com.LeetCode;

import java.util.HashMap;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/22 8:38
 */
public class _106_从中序与后序遍历序列构造二叉树 {
    int[] inorder;
    int[] postorder;
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length-1;
        this.inorder = inorder;
        this.postorder = postorder;
        int idx = 0;
        return help(0,inorder.length);
    }
    public TreeNode help(int left,int right){
        if (left > right){
            return null;
        }

        int root_val = postorder[index];
        TreeNode res = new TreeNode(root_val);
        int i;
        for (i = 0; i < inorder.length; i++) {
            if (inorder[i] == root_val){
                break;
            }
        }
        index--;

        res.right = help(i+1,right);
        res.left = help(left,i-1);
        return res;
    }
}
