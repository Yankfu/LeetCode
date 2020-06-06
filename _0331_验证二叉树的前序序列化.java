package com.LeetCode;

import java.util.Stack;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/4 23:06
 */
public class _0331_验证二叉树的前序序列化 {
    public boolean isValidSerialization(String preorder) {
        // number of available slots
        int slots = 1;

        int n = preorder.length();
        for(int i = 0; i < n; ++i) {
            if (preorder.charAt(i) == ',') {
                // one node takes one slot
                --slots;

                // no more slots available
                if (slots < 0) {
                    return false;
                }

                // non-empty node creates two children slots
                if (preorder.charAt(i - 1) != '#') {
                    slots += 2;
                }
            }
        }

        // the last node
        slots = (preorder.charAt(n - 1) == '#') ? slots - 1 : slots + 1;
        // all slots should be used up
        return slots == 0;
    }
}
