package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/25 12:17
 */
public class _0213_打家劫舍II {
    public static void main(String[] args) {

    }
    public int rob(int[] nums) {
        int len = nums.length;
        int pre = 0;
        int now = 0;
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            int temp = now;
            now = Math.max(now,nums[i]+pre);
            pre = temp;
        }
        res = now;
        pre = 0;
        now = 0;

        for (int i = 0; i < nums.length-1; i++) {
            int temp = now;
            now = Math.max(now,nums[i]+pre);
            pre = temp;
        }
        return Math.max(now,res);
    }
}
