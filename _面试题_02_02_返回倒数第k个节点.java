package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/1 22:36
 */
public class _面试题_02_02_返回倒数第k个节点 {
    public static void main(String[] args) {

    }
    public int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (k!=0){
            fast = fast.next;
            k--;
        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }
}
