package com.LeetCode;

import java.util.Stack;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/12 23:07
 */
public class _0155_最小栈 {
    class MinStack {

        Stack<Integer> stack;
        Stack<Integer> helpStack;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            helpStack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if (helpStack.isEmpty()){
                helpStack.push(x);
            }else {
                if (x < helpStack.peek()){
                    helpStack.push(x);
                }else {
                    helpStack.push(helpStack.peek());
                }
            }
        }

        public void pop() {
            stack.pop();
            helpStack.pop();
        }

        public int top() {
            if (stack.isEmpty()){
                return -1;
            }else {
                return stack.peek();
            }
        }

        public int getMin() {
            if (stack.isEmpty()){
                return -1;
            }else {
                return helpStack.peek();
            }
        }
    }
}
