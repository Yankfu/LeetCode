package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/7/8 9:31
 */
public class _面试题_16_11_跳水板 {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0){
            return new int[]{};
        }
        if (shorter == longer){
            return new int[]{shorter*k};
        }
        int[] res = new int[k+1];
        int count = longer - shorter;
        int length = shorter * k;
        for (int i = 0; i <= k; i++) {
            res[i] = length + i*count;
        }
        return res;
    }
}
