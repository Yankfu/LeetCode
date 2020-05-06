package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/7 0:05
 */
public class _0572_另一个树的子树 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null){
            return false;
        }
        if(help(s,t)){
            return true;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    public boolean help(TreeNode s, TreeNode t){
        if (s == null && t == null){
            return true;
        }
        if (s == null || t == null){
            return false;
        }
        if (s.val != t.val){
            return false;
        }

        return help(s.left,t.left) && help(s.right,t.right);
    }
}
