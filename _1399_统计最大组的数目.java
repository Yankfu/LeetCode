package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/12 10:27
 */
public class _1399_统计最大组的数目 {
    public static int countLargestGroup(int n) {
        int[] count = new int[37];

        for (int i = 1; i <= n; i++) {
            count[help(i)]++;
        }

        int res = 0;
        int big = Integer.MIN_VALUE;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > big) {
                big = count[i];
                res = 1;
            }else if (count[i] == big) {
                res++;
            }
        }

        return res;
    }
    public static int help(int n){
        int res = 0;
        while (n>0){
            res += n%10;
            n = n/10;
        }
        return res;
    }
}
