package com.LeetCode;

public class _0203_移除链表元素 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { 
	    	val = x; 
	    }
	}
	
	public static ListNode removeElements(ListNode head, int val) {
		ListNode header = new ListNode(-1);
		header.next = head;
		ListNode iter = header;
		while(iter.next != null) {
			ListNode curr = iter.next;
			if(curr.val == val) {
				iter.next = curr.next;
				continue;
			}
			iter = iter.next;
		}
		return header.next;
		return null;
    }
}
