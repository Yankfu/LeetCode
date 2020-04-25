package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/25 10:12
 */
public class _LCP_07_传递信息 {
    static int res = 0;
    public static int numWays(int n, int[][] relation, int k) {
        int[][] massage = new int[n][n];
        for (int i = 0; i < relation.length; i++) {
            massage[relation[i][0]][relation[i][1]] = 1;
        }
        help(0,massage,0,k);
        return res;
    }
    public static void help(int n,int[][] massage,int step,int k){
        if (step == k){
            if (n == massage.length-1){
                res++;
            }
            return;
        }else if (step < k){
            for (int i = 0; i < massage.length; i++) {
                if (massage[n][i] == 1){
                    help(i,massage,step+1,k);
                }
            }
        }else {
            return;
        }
    }
}
