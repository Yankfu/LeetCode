package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/30 23:23
 */
public class _1423_可获得的最大点数 {
    public int maxScore(int[] cardPoints, int k) {
        int tempL = 0;
        int tempR = 0;
        for (int i = 0; i < k; i++) {
            tempL += cardPoints[i];
        }
        int res = tempL;
        for (int i = 1; i <= k; i++) {
            tempL -= cardPoints[k-i];
            tempR += cardPoints[cardPoints.length-i];
            res = Math.max(res,tempL+tempR);
        }
        return res;
    }
}
