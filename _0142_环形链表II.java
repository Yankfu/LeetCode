package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class _0142_环形链表II {
    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
}
