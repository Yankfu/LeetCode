package com.LeetCode;

public class _0086_分隔链表 {
    public static void main(String[] args) {
        CreateNode ct = new CreateNode();
        int[] nums = {};
        ListNode head = ct.createListNode(nums);
        head = partition(head,3);
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
    public static ListNode partition(ListNode head, int x) {
        ListNode littleRes = new ListNode(0);
        ListNode bigBefore = new ListNode(0);
        ListNode little = littleRes;
        ListNode big = bigBefore;
        ListNode temp = head;
        while(temp != null){
            if(temp.val >= x){
                big.next = temp;
                big = big.next;
            }else if(temp.val < x){
                little.next = temp;
                little = little.next;
            }
            temp = temp.next;
        }
        little.next = bigBefore.next;
        big.next = null;
        return littleRes.next;
    }
}
