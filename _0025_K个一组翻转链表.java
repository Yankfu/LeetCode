package com.LeetCode;

import java.util.Stack;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/18 22:04
 */
public class _0025_K个一组翻转链表 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode res = reverseKGroup(head,2);
        int count = 0;
        while (res!=null){
            System.out.print(res.val+"→");
            res = res.next;
            if (count++ == 20){
                break;
            }
        }
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        ListNode ret = new ListNode(0);
        ListNode next = ret;
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        ListNode tempHead = null;
        while (head!=null){
            if (count == 0){
                tempHead = head;
            }
            //System.out.print(head.val+"  ");
            stack.push(head.val);
            //System.out.println(head.val);
            head = head.next;
            count++;
            if (count == k){
                while (!stack.isEmpty()){
                    ListNode tempA = new ListNode(stack.pop());
                    next.next = tempA;
                    next = tempA;
                }
                count = 0;
            }
        }
        if (!stack.isEmpty()){
            next.next = tempHead;
        }
        return ret.next;
    }
}
