package com.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/8 22:06
 */
public class _1438_绝对差不超过限制的最长连续子数组 {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxQ = new LinkedList<>();
        Deque<Integer> minQ = new LinkedList<>();
        int ans = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            while (!maxQ.isEmpty() && nums[maxQ.peekLast()]<nums[end]){
                maxQ.pollLast();
            }
            maxQ.add(end);
            while (!minQ.isEmpty() && nums[minQ.peekLast()]>nums[end]){
                minQ.pollLast();
            }
            minQ.add(end);

            while (!maxQ.isEmpty() && !minQ.isEmpty() && nums[maxQ.peek()]-nums[minQ.peek()]>limit){
                if (maxQ.peek()<=start){
                    maxQ.poll();
                }
                if (minQ.peek()<=start){
                    minQ.poll();
                }
                start++;
            }
            ans = Math.max(ans,end-start+1);
        }
        return ans;
    }
}
