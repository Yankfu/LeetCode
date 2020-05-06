package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/6 23:32
 */
public class _面试题_01_02_判定是否互为字符重排 {
    public boolean CheckPermutation(String s1, String s2) {
        int[] count = new int[129];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i)]--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
