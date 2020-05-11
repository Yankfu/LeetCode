package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/11 15:52
 */
public class _1433_检查一个字符串是否可以打破另一个字符串 {
    public boolean checkIfCanBreak(String s1, String s2) {
        if (s1.length()!=s2.length()){
            return false;
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean aBiggerb = true;
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == ch2[i]){
                continue;
            }else {
                if (ch1[i] > ch2[i]){
                    aBiggerb = true;
                    break;
                }else {
                    aBiggerb = false;
                }
            }
        }

        for (int i = 0; i < ch1.length; i++) {
            if (aBiggerb){
                if (ch1[i] < ch2[i]){
                    return false;
                }
            }else {
                if (ch1[i] > ch2[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
