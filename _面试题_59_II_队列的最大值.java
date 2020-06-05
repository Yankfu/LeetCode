package com.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/7 上午11:42
 * @Version 1.0
 */
public class _面试题_59_II_队列的最大值 {

	public static void main(String[] args) {
		MaxQueue maxQueue = new MaxQueue();
		System.out.println(maxQueue.max_value());
		System.out.println(maxQueue.pop_front());
		System.out.println(maxQueue.pop_front());
		maxQueue.push_back(94);
		maxQueue.push_back(16);
		maxQueue.push_back(89);
		System.out.println(maxQueue.pop_front());
		maxQueue.push_back(22);
		System.out.println(maxQueue.pop_front());
	}
	static class MaxQueue {
		List<Integer> li;
		List<Integer> big;
		public MaxQueue() {
			li = new ArrayList<>();
			big = new ArrayList<>();
		}

		public int max_value() {
			if(big.size()>0){
				return big.get(0);
			}
			return -1;
		}

		public void push_back(int value) {
			li.add(value);
			if (big.size() == 0){
				big.add(value);
			}else{
				for (int i = 0; i < big.size(); i++) {
					if (big.get(i)<value){
						big.add(i,value);
						return;
					}
				}
				big.add(value);
			}
		}

		public int pop_front() {
			if (big.size() == 0){
				return -1;
			}
			int res = li.get(0);
			li.remove(0);
			big.remove(big.indexOf(res));
			return res;
		}
	}
}
