package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/25 22:18
 */
public class _面试题_16_17_连续数列 {
    /**
     * 定义一个最大的，一个临时的
     * 如果临时的小于0就用最新的，不小于0就一直加
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int big = nums[0];
        for (int i = 1; i < nums.length; i++) {
            big = Math.max(nums[i],big+nums[i]);
            res = Math.max(big,res);
        }
        return res;
    }
}
