package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/29 23:00
 */
public class _面试题_05_06_整数转换 {
    public static void main(String[] args) {
        int a = 29;
        int b = 15;
        System.out.println(new _面试题_05_06_整数转换().convertInteger(a,b));
    }
    public int convertInteger(int A, int B) {
        return Integer.bitCount(A ^ B);
    }
}
