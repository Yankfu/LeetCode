package com.LeetCode;

public class _0061_旋转链表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
		ListNode newHead = rotateRight(head,4);
		while(newHead != null) {
			System.out.print(newHead.val+"->");
			newHead = newHead.next;
		}
	}
	//三指针，一个定位第一个，一个定位最后一个（最后一个.next = 第一个）
	//然后把链表搞成环形链表
	//打断最后一个
	//最后一个.next = null;
	public static ListNode rotateRight(ListNode head, int k) {
		if(head == null || head.next == null) {
			return head;
		}
        ListNode dumb = head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode newHead = head;
        int count=1;
        while(newHead.next != null) {
			count++;
			newHead = newHead.next;
		}                
        int temp = k;
        temp = temp % count;
        if(temp == 0) {
        	return head;
        }
        //System.out.println(count+"  count");
        while(temp-1>0) {
        	fast = fast.next;
        	temp--;
        }
        while(fast.next!=null && fast!=null) {
        	fast = fast.next;
        	slow = slow.next;
        }
        newHead.next = head;
        
        while(dumb.next != slow) {
			dumb = dumb.next;
		}
        dumb.next = null;
		return slow;
    }
}
