package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/2 上午9:24
 * @Version 1.0
 */
public class _0206_反转链表 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		CreateNode cn = new CreateNode();
		ListNode head = cn.createListNode(nums);
		ListNode res = reverseList(head);
		while(res!=null){
			System.out.print(res.val+"  ");
			res = res.next;
		}
	}
	public static ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode nhead = head;
		while(nhead != null){
			ListNode ne = nhead.next;
			nhead.next = pre;
			pre = nhead;
			nhead = ne;
		}
		return pre;
	}
}