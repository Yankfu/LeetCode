package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/15 22:47
 */
public class _面试题_27_二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left=mirrorTree(root.right);
        TreeNode right=mirrorTree(root.left);
        root.left=left;
        root.right=right;
        return root;
    }
}
