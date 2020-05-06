package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/6 23:26
 */
public class _面试题_58_II_左旋转字符串 {
    public static void main(String[] args) {

    }
    public String reverseLeftWords(String s, int n) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i < ch.length; i++) {
            sb.append(ch[i]);
        }
        for (int i = 0; i < n; i++) {
            sb.append(ch[i]);
        }
        return s.substring(n)+s.substring(0,n);
    }
}
