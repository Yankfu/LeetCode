package com.LeetCode;

public class _面试题62_圆圈中最后剩下的数字 {
    public static void main(String[] args) {

    }
    public static int lastRemaining(int n, int m) {
        int res = 0;
        for(int i = 2;i<= n;i++){
            res = (res+ m)%i;
        }
        return res;
    }
}
