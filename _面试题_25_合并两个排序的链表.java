package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/21 下午11:13
 * @Version 1.0
 */
public class _面试题_25_合并两个排序的链表 {
	public static void main(String[] args) {

	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(1);
		ListNode nhead = null;
		head.next = nhead;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val){
				nhead = l1;
				nhead = nhead.next;
				l1 = l1.next;
			}else {
				nhead = l2;
				nhead = nhead.next;
				l2 = l2.next;
			}
		}
		if (l1 == null) {
			nhead.next = l2;
		} else {
			nhead.next = l1;
		}
		return head.next;
	}
}