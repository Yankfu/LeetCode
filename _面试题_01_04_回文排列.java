package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/1 23:17
 */
public class _面试题_01_04_回文排列 {
    public static void main(String[] args) {

    }
    public boolean canPermutePalindrome(String s){
        Set<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (set.contains(ch[i])) {
                set.remove(ch[i]);
            }else {
                set.add(ch[i]);
            }
        }
        if (set.size()>1){
            return false;
        }
        return true;
    }
}
