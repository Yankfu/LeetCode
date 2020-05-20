package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/20 18:41
 */
public class _1448_统计二叉树中好节点的数目 {
    //5398. 统计二叉树中好节点的数目
    private int count = 0;
    public int goodNodes(TreeNode root) {
        help(root,Integer.MIN_VALUE);
        return count;
    }
    public void help(TreeNode root,int num){
        if (root == null){
            return;
        }
        if (root.val >= num){
            count++;
            help(root.left,root.val);
            help(root.right,root.val);
        }else {
            help(root.left,num);
            help(root.right,num);
        }
    }
}
