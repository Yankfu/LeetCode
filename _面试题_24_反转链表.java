package com.LeetCode;


import java.util.Stack;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/21 23:26
 */
public class _面试题_24_反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode dumb = new ListNode(0);
        Stack<Integer> stack = new Stack<>();
        while (head!=null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode temp = dumb.next;
        while (!stack.isEmpty()){
            temp = new ListNode(stack.pop());
            temp = temp.next;
        }
        return dumb.next;
    }
}
