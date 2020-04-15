package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/15 23:03
 */
public class _1411_给Nx3网格图涂色的方案数 {
    public static void main(String[] args) {

    }
    public static int numOfWays(int n) {
        int res = 0;
        long a = 6;
        long b = 6;
        long mod = 1000000007;
        for (int i = 1; i < n; i++) {
            long tempA = a;
            long tempB = b;
            a = (tempA*3%mod + tempB*2%mod) % mod;
            b = (tempA*2%mod + tempB*2%mod) % mod;
        }
        return (int)((a+b)%mod);
    }
}
