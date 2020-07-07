package com.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/7/7 7:21
 */
public class _0279_完全平方数 {
    /**
     *
     * @param n
     * @return
     */
    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; i-j*j >= 0; j++) {
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
