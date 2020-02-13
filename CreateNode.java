package com.LeetCode;

public class CreateNode {
    public ListNode createListNode(int[] nums){
        if(nums.length==0){
            return null;
        }
        if(nums.length==1){
            return new ListNode(nums[0]);
        }
        ListNode head = new ListNode(nums[0]);
        ListNode dumb = head;
        for(int i=1;i<nums.length;i++){
            dumb.next = new ListNode(nums[i]);
            dumb = dumb.next;
        }
        dumb.next = null;
        return head;
    }
}
