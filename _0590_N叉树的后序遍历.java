package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/23 22:16
 */

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
public class _0590_N叉树的后序遍历 {
//    List<Integer> list;
//    public List<Integer> postorder(Node root) {
//        list = new ArrayList<>();
//        dfs(root);
//        return list;
//    }
//
//    private void dfs(Node root) {
//        if (root == null){
//            return;
//        }
//        for (Node child:root.children){
//            dfs(child);
//        }
//        list.add(root.val);
//    }

    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        for (Node child:root.children){
            list.addAll(postorder(child));
        }
        list.add(root.val);
        return list;
    }
}
