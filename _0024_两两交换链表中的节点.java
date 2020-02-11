package com.LeetCode;

public class _0024_两两交换链表中的节点 {
    public static void main(String[] args) {
        CreateNode ln= new CreateNode();
        int[] nums = {1,2,3};
        ListNode head = ln.createListNode(nums);
        ListNode res = swapPairs(head);
        while(res!=null){
            System.out.print(res.val+" ");
            res = res.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dumb = new ListNode(-1);
        dumb.next = head;
        ListNode pre = dumb;
        ListNode a;
        ListNode b;
        while(head != null && head.next !=null){
            a = head;
            b = a.next;
            pre.next = b;
            a.next = b.next;
            b.next = a;
            head = a.next;
            pre = a;
        }
        return dumb.next;
    }
}
