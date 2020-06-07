package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/7 14:29
 */
public class _1464_数组中两元素的最大乘积 {
    //数组中两元素的最大乘积
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
    }
}
