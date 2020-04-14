package com.LeetCode;

import java.util.List;
import java.util.Stack;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/14 21:29
 */
public class _0445_两数相加II {
    public static void main(String[] args) {

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode next = ret.next;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;//进位
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry>0) {
            int sum = carry;
            sum += stack1.isEmpty()? 0 :stack1.pop();
            sum += stack2.isEmpty()? 0 :stack2.pop();
            ListNode temp = new ListNode(sum%10);
            temp.next = ret.next;
            ret.next = temp;
            carry = sum / 10;
        }

        return ret.next;
    }
}