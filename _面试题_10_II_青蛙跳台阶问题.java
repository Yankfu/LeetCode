package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/14 23:30
 */
public class _面试题_10_II_青蛙跳台阶问题 {
    public static void main(String[] args) {

    }
    public int numWays(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int temp1 = 1;
        int temp2 = 2;
        int res = 0;
        while (n-- >= 0) {
            res = (temp1+temp2) % 1000000007;
            temp2 = res;
            temp1 = temp2;
        }
        return res;
    }
}
