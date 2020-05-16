package com.LeetCode;

import java.util.*;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/16 17:24
 */
public class _面试题_04_03_特定深度节点链表 {
    //层次遍历
    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree == null){
            return new ListNode[0];
        }
        ArrayList<ArrayList<TreeNode>> res = new ArrayList<>();
        Queue<TreeNode> deque = new LinkedList<>();
        deque.offer(tree);
        while (!deque.isEmpty()){
            int len = deque.size();
            ArrayList<TreeNode> tempList = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode temp = deque.poll();
                tempList.add(temp);
                if (temp.left!=null) deque.offer(temp.left);
                if (temp.right!=null) deque.offer(temp.right);
            }
            res.add(tempList);
        }
        ListNode[] nodeArr = new ListNode[res.size()];
        for (int i = 0; i < nodeArr.length; i++) {
            ArrayList<TreeNode> tempList = res.get(i);
            ListNode head = new ListNode(0);
            ListNode dumb = head;
            for (int j = 0; j < tempList.size(); j++) {
                ListNode now = new ListNode(tempList.get(j).val);
                dumb.next = now;
                dumb = now;
            }
            nodeArr[i] = head.next;
        }
        return nodeArr;
    }
}
