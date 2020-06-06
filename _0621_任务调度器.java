package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/6 21:54
 */
public class _0621_任务调度器 {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            count[tasks[i]-'A']++;
        }
        Arrays.sort(count);
        int res = 0;
        while (count[25] > 0){
            //新建一个桶，给桶里放东西
            int i = 0;
            while (i<=n){
                if (count[25] == 0) {
                    break;
                }
                if (i<26 && count[25-i] > 0){
                    count[25-i]--;
                }
                i++;
            }
            res += n;
            Arrays.sort(count);
        }
        return res;
    }
}
