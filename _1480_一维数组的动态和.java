package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/15 22:49
 */
public class _1480_一维数组的动态和 {
    //一维数组的动态和
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int count = 0;
        int i = 0;
        for (int num : nums){
            count+=num;
            res[i++] = count;
        }
        return res;
    }
}
