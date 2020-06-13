package com.LeetCode;

import java.util.Stack;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/12 10:20
 */
public class _0735_行星碰撞 {

    public static void main(String[] args) {
        System.out.println(asteroidCollision(new int[]{1,-2,-2,-2}));
    }

    /**
     * 先判断栈的长度
     * 如果是空，直接入栈
     * 如果有，peek第一个看是否是正数且异号
     *      如果异号判断大小
     *          将要入栈的大，就pop然后跳转到判断栈空满
     *          栈元素大，进行下一个元素的比较。
     * @param asteroids
     * @return
     */
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for (int ast: asteroids) {
            collision: {
                while (!stack.isEmpty() && ast < 0 && 0 < stack.peek()) {
                    if (stack.peek() < -ast) {
                        stack.pop();
                        continue;
                    } else if (stack.peek() == -ast) {
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(ast);
            }
        }

        int[] ans = new int[stack.size()];
        for (int t = ans.length - 1; t >= 0; --t) {
            ans[t] = stack.pop();
        }
        return ans;
    }
}
