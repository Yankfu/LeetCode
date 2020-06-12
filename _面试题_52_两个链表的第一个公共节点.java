package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/11 22:42
 */
public class _面试题_52_两个链表的第一个公共节点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA!=tempB) {
            if (tempA==null){
                tempA = headB;
            }else {
                tempA = tempA.next;
            }
            if (tempB==null){
                tempB = headA;
            }else {
                tempB = tempB.next;
            }
        }
        return tempA;
    }
}
