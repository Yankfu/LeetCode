package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/1 22:39
 */
public class _面试题_02_01_移除重复节点 {
    public static void main(String[] args) {

    }
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode later = null;
        Set<Integer> set = new HashSet<>();
        while (pre != null){
            if (!set.contains(pre.val)){
                set.add(pre.val);
                later = pre;
                pre = pre.next;
            } else {
                pre = pre.next;
                later.next = pre;
            }
        }
        return head;
    }
}
