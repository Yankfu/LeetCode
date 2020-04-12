package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/12 10:28
 */
public class _1402_做菜顺序 {
    public static int maxSatisfaction(int[] satisfaction) {
        int res = 0;
        Arrays.sort(satisfaction);
        int pre = 0;
        int count = 0;
        for (int i = satisfaction.length-1; i >= 0; i--) {
            count = satisfaction[i] + res + pre;
            if (count > res) {
                pre = pre + satisfaction[i];
                res = count;
            }else if (count <= res) {
                break;
            }
        }
        return res;
    }
}
