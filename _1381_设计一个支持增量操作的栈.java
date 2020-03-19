package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/19 下午9:48
 * @Version 1.0
 */
public class _1381_设计一个支持增量操作的栈 {
	class CustomStack {
		int[] nums;
		int index;
		int flot;
		public CustomStack(int maxSize) {
			index = 0;
			flot = 0;
			nums = new int[maxSize];
		}

		public void push(int x) {
			if (index == nums.length) return;
			nums[index++] = x;
		}

		public int pop() {
			if (index == 0) return -1;
			return nums[--index];
		}

		public void increment(int k, int val) {
			if (index == 0) return;
			flot = Math.min(k,index);
			for (int i = 0; i < flot; i++) {
				nums[i] += val;
			}
		}
	}
}
