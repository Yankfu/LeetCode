package com.LeetCode;

public class _0019_删除链表的倒数第N个节点 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode ln1 = new ListNode(2);
		ListNode ln2 = new ListNode(3);
		ListNode ln3 = new ListNode(4);
		ListNode ln4 = new ListNode(5);
		head.next=ln1;
		ln1.next=ln2;
		ln2.next=ln3;
		ln3.next=ln4;
		//System.out.println(removeNthFromEnd(head,2));
		ListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
//		if(head.next==null && n==1) {
//			return null;
//		}
//		ListNode temp1 = head;
//        ListNode temp2 = head;
//        int count=0;
//		while(temp1.next!=null) {
//        	if(count!=n) {
//        		temp1=temp1.next;
//        		count++;
//        	}
//        	if(count == n) {
//        		temp1=temp1.next;
//        		temp2=temp2.next;
//        	}
//        }
//		temp2.next=temp2.next.next;
//		
//		return head;
		ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode first = dummy;
	    ListNode second = dummy;
	    // Advances first pointer so that the gap between first and second is n nodes apart
	    for (int i = 1; i <= n + 1; i++) {
	        first = first.next;
	    }
	    // Move first to the end, maintaining the gap
	    while (first != null) {
	        first = first.next;
	        second = second.next;
	    }
	    second.next = second.next.next;
	    return dummy.next;
    }
}
