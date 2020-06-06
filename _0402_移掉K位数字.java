package com.LeetCode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/4 23:15
 */
public class _0402_移掉K位数字 {
    public String removeKdigits(String num, int k) {
        Deque<Character> deque = new LinkedList<>(); // asc
        char[] arr = num.toCharArray();

        // 遍历，逐个入队
        for (char c : arr) {
            while (!deque.isEmpty() && k > 0 && deque.getLast() > c) {
                k--;
                deque.removeLast();
            }
            deque.addLast(c);
        }

        // k 还有余，后面大的删起
        while (k-- > 0 && !deque.isEmpty()) {
            deque.removeLast();
        }

        // 移除头部零
        while (!deque.isEmpty() && deque.getFirst() == '0') {
            deque.removeFirst();
        }
        if (deque.isEmpty()) {
            return "0";
        }

        // 构建，返回
        char[] res = new char[deque.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = deque.removeFirst();
        }
        return new String(res);
    }
}
