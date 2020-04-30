package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/30 23:22
 */
public class _1422_分割字符串的最大得分 {
    public int maxScore(String s) {
        char[] ch = s.toCharArray();
        int count1 = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0'){

            }else if (ch[i] == '1'){
                count1++;
            }
        }
        int temp = 0;
        int res = 0;
        for (int i = 0; i < ch.length-1; i++) {
            if (ch[i] == '0'){
                temp++;
            } else if (ch[i] == '1') {
                count1--;
            }
            if (temp + count1 > res) {
                res = temp + count1;
            }
        }
        return res;
    }
}
