package com.LeetCode;

public class _0105_从前序与中序遍历序列构造二叉树 {
    public TreeNode buildTreePI(int[] preorder, int[] inorder) {
        if (preorder == null ||
                preorder.length == 0 ||
                inorder == null ||
                inorder.length == 0 ||
                preorder.length != inorder.length) {
            return null;
        }
        return helpPreIn(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode helpPreIn(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if (pStart > pEnd || iStart > iEnd) {
            return null;
        }
        TreeNode head = new TreeNode(preorder[pStart]);
        int index = 0;  //index找到根节点在中序遍历的位置
        while (inorder[iStart + index] != preorder[pStart]) {
            index++;
        }
        //重建左子树
        head.left = helpPreIn(preorder, pStart + 1, pStart + index, inorder, iStart, iStart + index - 1);
        //重建右子树
        head.right = helpPreIn(preorder, pStart + index + 1, pEnd, inorder, iStart + index + 1, iEnd);
        return head;
    }
}
