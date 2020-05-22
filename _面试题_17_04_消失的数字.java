package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/21 23:37
 */
public class _面试题_17_04_消失的数字 {
    public int missingNumber(int[] nums) {
        int sum = nums.length;//记录实际总和
        for(int i = 0; i < nums.length; i++) {
            sum -= nums[i];//减去现在总和
            sum += i;
        }
        return sum;
    }
}
