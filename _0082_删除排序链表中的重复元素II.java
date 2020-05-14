package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/14 23:18
 */
public class _0082_删除排序链表中的重复元素II {
    public static void main(String[] args) {

    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode dumb = new ListNode(0);
        dumb.next = head;
        ListNode cur = dumb;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                ListNode temp = cur.next;
                while (temp != null && temp.next != null && temp.val == temp.next.val ) {
                    temp = temp.next;
                }
                cur.next = temp.next;
            }
            else
                cur = cur.next;
        }
        return dumb.next;
    }
}
