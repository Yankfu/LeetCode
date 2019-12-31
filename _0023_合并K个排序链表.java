package com.LeetCode;

public class _0023_合并K个排序链表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(1);
		ListNode head3 = new ListNode(2);
		ListNode h1l1 = new ListNode(4);
		ListNode h1l2 = new ListNode(5);
		ListNode h2l1 = new ListNode(3);
		ListNode h2l2 = new ListNode(4);
		ListNode[] lists = {head1,head2,head3};
		ListNode res = mergeKLists(lists);
		while(res!=null) {
			System.out.print(res.val);
			res=res.next;
		}
	}
	public static ListNode mergeKLists(ListNode[] lists) {
        for(int i=1;i<lists.length;i++) {
        	ListNode dummyHead = new ListNode(0);
            ListNode cur = dummyHead;
            while (lists[0] != null && lists[i] != null) {
                if (lists[0].val < lists[i].val) {
                    cur.next = lists[0];
                    cur = cur.next;
                    lists[0] = lists[0].next;
                } else {
                    cur.next = lists[i];
                    cur = cur.next;
                    lists[i] = lists[i].next;
                }
            }
            // 任一为空，直接连接另一条链表
            if (lists[0] == null) {
                cur.next = lists[i];
            } else {
                cur.next = lists[0];
            }
            lists[0]=dummyHead.next;
        }
		return lists[0];
    }
}
