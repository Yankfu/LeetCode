package com.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/1 下午11:23
 * @Version 1.0
 */
public class _0225_用队列实现栈 {
}
class MyStack {
	Queue<Integer> list;

	/** Initialize your data structure here. */
	public MyStack() {
		list = new LinkedList<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		list.add(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		for (int i = 0; i < list.size() - 1; i++) {
			list.add(list.poll());
		}
		return list.poll();
	}

	/** Get the top element. */
	public int top() {
		for (int i = 0; i < list.size() - 1; i++) {
			list.add(list.poll());
		}
		int res = list.poll();
		list.add(res);
		return res;
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return list.peek() == null ? true : false;
	}
}
