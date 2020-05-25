package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/25 22:36
 */
public class _0495_提莫攻击 {
    public static void main(String[] args) {

    }
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0){
            return 0;
        }
        int res = 0;
        int pre = timeSeries[0];
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i] - pre >= duration){
                res += duration;
            }else {
                res = res + timeSeries[i] - pre;
            }
            pre = timeSeries[i];
        }
        return res+duration;
    }
}
