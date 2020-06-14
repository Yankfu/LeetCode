package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/14 8:06
 */
public class _1470_重新排列数组 {
    //重新排列数组
    public int[] shuffle(int[] nums, int n) {
        int x = 0;
        int y = n;
        int index = 0;
        int[] res = new int[nums.length];
        while (y < nums.length){
            res[index++] = nums[x++];
            res[index++] = nums[y++];
        }
        return res;
    }
}
