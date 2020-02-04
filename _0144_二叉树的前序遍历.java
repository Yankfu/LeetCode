package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0144_二叉树的前序遍历 {
    public static void main(String[] args) {
        CreateTree ct = new CreateTree();
        int[] pre={};
        int[] in ={};
        TreeNode root=ct.buildTreePI(pre,in);
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        if(root!=null){
            li.add(root.val);
        }
        if(root == null){
            return li;
        }
        if(root.left!=null){
            li.addAll(preorderTraversal(root.left));
        }
        if(root.right!=null){
            li.addAll(preorderTraversal(root.right));
        }
        return li;
    }
}
