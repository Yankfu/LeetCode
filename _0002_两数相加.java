package com.LeetCode;

public class _0002_两数相加 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ListNode ls11 = new ListNode(1);
		ListNode ls12 = new ListNode(1);
		ListNode ls13 = new ListNode(1);
		ls11.next=ls12;
		ls12.next=ls13;
		
		
		ListNode ls21 = new ListNode(9);
		ListNode ls22 = new ListNode(9);
		ListNode ls23 = new ListNode(9);
		ls21.next=ls22;
		ls22.next=ls23;
		ListNode ls = addTwoNumbers(ls11,ls21);
		while(ls != null)
		{
			System.out.print(ls.val+" --> ");
			ls=ls.next;
		}
	}

	//��ȡ��λλ��ִ��һ�μӣ�ȷ����λλ��Ȼ����sum-10ȷ��head��ֵ��
	//��head.next=new ListNode(0);
	//��head=head.next;
	//�ظ�֮ǰ�Ĳ�����
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carryIn=0;
		ListNode head = new ListNode(0);
		ListNode trueHead = head;
		ListNode ls11 =l1;
		ListNode ls21 =l2;
		
		while( (ls11 != null) || (ls21 != null))
		{
			int aVal = (ls11 != null)?ls11.val:0;
			int bVal = (ls21 != null)?ls21.val:0;
			int sum=aVal+bVal+carryIn;
			System.out.println(sum);
			
			carryIn=sum/10;
			
			head.next=new ListNode(sum%10);
			head=head.next;
			
			if (ls11 != null) 
			{
				ls11 = ls11.next;
			}
	        if (ls21 != null)
	        {
	        	ls21 = ls21.next;
	        }
		}
		
		if(carryIn==1)
		{
			head.next=new ListNode(1);
		}
		
		return trueHead;
	}
}

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */