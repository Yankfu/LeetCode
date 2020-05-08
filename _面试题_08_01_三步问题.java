package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/8 20:15
 */
public class _面试题_08_01_三步问题 {
    public static void main(String[] args) {
        System.out.println(waysToStep(1000000));
    }
    public static int waysToStep(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        if (n == 3){
            return 4;
        }
        int f1 = 1;
        int f2 = 2;
        int f3 = 4;
        int res = 0;
        for (int i = 3; i < n; i++) {
            res = ((f1 + f2)%1000000007 + f3)%1000000007;
            f1 = f2;
            f2 = f3;
            f3 = res;
        }
        return res%1000000007;
    }
}
