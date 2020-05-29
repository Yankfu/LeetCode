package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/27 22:31
 */
public class _面试题_17_05_字母与数字 {
    public String[] findLongestSubarray(String[] array) {
        int len = array.length;
        int[] memo = new int[(len << 1) + 1];
        Arrays.fill(memo, -2);
        memo[len] = -1;
        int res = 0, count = 0, begin = 0, end = 0;
        for (int i = 0; i < len; ++i) {
            boolean is_num = true;
            for (char c : array[i].toCharArray())
                if (c < '0' || c > '9') {
                    is_num = false;
                    break;
                }
            count += is_num ? -1 : 1;
            //未曾见过该前缀和(即memo数组中没有记录)
            if (memo[count + len] <= -2)
                memo[count + len] = i;  //记录该前缀和的下标
                //曾见过该前缀和(即memo数组中已有记录)
            else if (i - memo[count + len] > res) {
                begin = memo[count + len] + 1;
                end = i + 1;
                res = i - memo[count + len];
            }
        }
        return Arrays.copyOfRange(array, begin, end);
    }
}
