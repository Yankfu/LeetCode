package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/4 22:45
 */
public class _1379_找出克隆二叉树中的相同节点 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null){
            return null;
        }
        if (original == target){
            return cloned;
        }
        // 递归左子树
        TreeNode res = getTargetCopy(original.left,cloned.left,target);
        if (res != null){
            return res;
        }
        // 递归右子树
        res = getTargetCopy(original.right,cloned.right,target);
        if (res != null){
            return res;
        }
        return null;
    }
}
