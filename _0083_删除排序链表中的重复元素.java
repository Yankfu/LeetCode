package com.LeetCode;

public class _0083_删除排序链表中的重复元素 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = null;
//		head.next=new ListNode(1);
//		head.next.next=new ListNode(2);
//		head.next.next.next=new ListNode(3);
//		head.next.next.next.next=new ListNode(3);
		head=deleteDuplicates(head);
		while(head!=null) {
			System.out.print(head.val+"->");
			head=head.next;
		}
	}
	public static ListNode deleteDuplicates(ListNode head) {
		if(head==null) {
			return head;
		}
		if(head.next==null) {
			return head;
		}
        ListNode ln=head;
        ListNode fir = head;
        ListNode sec = head.next;
		while(true){
            if(fir.val==sec.val) {
            	sec=sec.next;
            }
            else {
            	fir.next=sec;
            	fir=sec;
            	sec=sec.next;
            }
            if(sec==null) {
            	fir.next=null;
            	break;
            }
        }
		return ln;
    }
}
