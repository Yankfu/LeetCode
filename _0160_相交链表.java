package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class _0160_相交链表 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        CreateNode cn = new CreateNode();
        ListNode headA =cn.createListNode(nums);
        ListNode headB = new ListNode(2);
        ListNode li = getIntersectionNode(headA,headB);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB!=null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
