package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/12 10:29
 */
public class _1403_非递增顺序的最小子序列 {
    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int temp = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            temp +=nums[i];
            list.add(nums[i]);
            if (temp > (total-temp)) {
                break;
            }
        }
        return list;
    }
}
