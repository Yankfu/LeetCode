package com.LeetCode;

import java.util.Stack;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/15 23:15
 */
public class _1047_删除字符串中的所有相邻重复项 {
    public String removeDuplicates(String S) {
        char[] temp = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch:temp){
            if (stack.isEmpty() || ch != stack.peek()) {
                stack.push(ch);
            } else {
                stack.pop();
            }
        }
        for (char ch:stack){
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}
