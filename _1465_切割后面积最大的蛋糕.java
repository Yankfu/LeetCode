package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/7 14:28
 */
public class _1465_切割后面积最大的蛋糕 {
    //切割后面积最大的蛋糕
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long maxH = Integer.MIN_VALUE;
        long maxV = Integer.MIN_VALUE;
        long pre = 0;
        for (int i = 0; i < horizontalCuts.length; i++) {
            if (horizontalCuts[i]-pre > maxH)
                maxH = horizontalCuts[i]-pre;
            pre = horizontalCuts[i];
        }
        if (h-pre > maxH)
            maxH = h-pre;
        pre = 0;
        for (int i = 0; i < verticalCuts.length; i++) {
            if (verticalCuts[i]-pre > maxV)
                maxV = verticalCuts[i]-pre;
            pre = verticalCuts[i];
        }
        if (w-pre > maxV)
            maxV = w-pre;
        maxH = maxH % 1000000007;
        maxV = maxV % 1000000007;
        return (int) ((maxH*maxV)%1000000007);
    }
}
