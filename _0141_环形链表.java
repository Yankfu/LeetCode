package com.LeetCode;

public class _0141_环形链表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
        	return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast) {
        	if(fast == null || fast.next==null) {
        		return false;
        	}
        	slow = slow.next;
        	fast = fast.next.next;
        }
		return true;
    }
}
