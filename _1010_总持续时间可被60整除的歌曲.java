package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/7/6 23:12
 */
public class _1010_总持续时间可被60整除的歌曲 {
    public int numPairsDivisibleBy60(int[] time) {
        int zero = 0;
        int[] count = new int[60];
        int res = 0;
        for (int i = 0; i < time.length; i++) {
            count[time[i] % 60]++;
        }
        res += (count[0]*(count[0]-1)/2);
        res += (count[30]*(count[30]-1)/2);
        for (int i = 59; i > 30; i--) {
            res += (count[i] * count[60-i]);
        }
        return res;
    }
}
