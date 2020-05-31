package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/31 23:14
 */
public class _1457_二叉树中的伪回文路径 {
    //5418. 二叉树中的伪回文路径
    int res = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] node = new int[10];
        node[root.val]++;
        help(root,node);
        return res;
    }

    public void help(TreeNode root, int[] node){
        if (root.left == null && root.right == null){
            if (isHuiWen(node)){
                res++;
                return;
            }else {
                return;
            }
        }
        if (root.left!=null){
            node[root.left.val]++;
            help(root.left,node);
            node[root.left.val]--;
        }
        if (root.right!=null){
            node[root.right.val]++;
            help(root.right,node);
            node[root.right.val]--;
        }
    }

    public boolean isHuiWen(int[] node){
        boolean isSingle = false;
        for (int i = 0; i < node.length; i++) {
            if (node[i] % 2 == 1){
                if (!isSingle){
                    isSingle = true;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
