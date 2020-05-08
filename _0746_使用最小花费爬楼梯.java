package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/8 20:00
 */
public class _0746_使用最小花费爬楼梯 {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(new _0746_使用最小花费爬楼梯().minCostClimbingStairs(cost));
    }
    public int minCostClimbingStairs(int[] cost) {
        int pre = 0;
        int now = 0;
        for (int i = 0; i < cost.length; i++) {
            int temp = Math.min(pre,now) + cost[i];
            pre = now;
            now = temp;
        }
        return Math.min(pre,now);
    }
}
