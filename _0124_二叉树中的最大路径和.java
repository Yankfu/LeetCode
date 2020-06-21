package com.LeetCode;


/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/21 7:54
 */
public class _0124_二叉树中的最大路径和 {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dp(root);
        return res;
    }

    public int dp(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = dp(root.left);
        left = left>0?left:0;
        int right = dp(root.right);
        right = right>0?right:0;
        int max = root.val + left + right;
        res = Math.max(res,max);
        return root.val + Math.max(left,right);
    }

}
