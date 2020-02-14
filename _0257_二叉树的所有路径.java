package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0257_二叉树的所有路径 {
    public static void main(String[] args) {

    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root,"",res);
        return res;
    }
    public static void dfs(TreeNode root,String str,List<String> list){
        if (root != null) {
            str += Integer.toString(root.val);
            if ((root.left == null) && (root.right == null))  // 当前节点是叶子节点
                list.add(str);  // 把路径加入到答案中
            else {
                str += "->";  // 当前节点不是叶子节点，继续递归遍历
                dfs(root.left, str, list);
                dfs(root.right, str, list);
            }
        }
    }
}
