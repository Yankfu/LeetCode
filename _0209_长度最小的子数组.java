package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/6 21:43
 */
public class _0209_长度最小的子数组 {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (right<n){
            sum += nums[right];
            right++;
            while (sum >= s){
                min = Math.min(min,right-left);
                sum -= nums[left];
                left++;
            }
        }
        return min == Integer.MAX_VALUE?0:min;
    }
}
