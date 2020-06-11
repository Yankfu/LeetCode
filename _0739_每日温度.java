package com.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/11 8:52
 */
public class _0739_每日温度 {
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];

        Deque<Integer> deque = new ArrayDeque<>();

        //如果是空或比当前大就入，如果比当前小就出，并且计算
        for (int i = 0; i < T.length; i++) {
            int temperature = T[i];
            //如果比当前小并且不为空
            while (!deque.isEmpty() && temperature > T[deque.peek()]) {
                int prevIndex = deque.pop();
                res[prevIndex] = i - prevIndex;
            }
            deque.push(i);
        }

        return res;
    }
}
