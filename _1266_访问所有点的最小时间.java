package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/16 18:13
 */
public class _1266_访问所有点的最小时间 {
    public static void main(String[] args) {

    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        int x1 = points[0][0];
        int y1 = points[0][1];
        for (int i = 1; i < points.length-1; i++) {
            int x2 = points[i][0];
            int y2 = points[i][1];
            res += Math.max(Math.abs(x1-x2),Math.abs(y1-y2));
            x1 = x2;
            y1 = y2;
        }
        return res;
    }
}
