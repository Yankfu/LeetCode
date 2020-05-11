package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/11 11:06
 */
public class _0050_myPow {
    public static void main(String[] args) {

    }
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? powHelp(x, N) : 1.0 / powHelp(x, -N);
    }
    public double powHelp(double x,long n){
        if (n == 0){
            return 1.0;
        }
        double y = powHelp(x,n/2);
        return n%2 == 1?y*y:y*y*x;
    }
}
