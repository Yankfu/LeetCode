package com.LeetCode;

public class _0876_链表的中间结点 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode middleNode(ListNode head) {
        ListNode fast,slow;
        fast=head;
        slow=head;
        while(fast != null && fast.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        }
		return slow;
    }
}
//ListNode slow = head, fast = head;
//while (fast != null && fast.next != null) {
//    slow = slow.next;
//    fast = fast.next.next;
//}
//return slow;
