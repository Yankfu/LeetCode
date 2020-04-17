package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/17 23:32
 */
public class _0453_最小移动次数使数组元素相等 {
    public static void main(String[] args) {

    }
    public static int minMoves(int[] nums) {
        int res = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<min) {
                min = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            res += nums[i]-min;
        }
        return res;
    }
}
