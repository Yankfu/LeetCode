package com.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/21 19:00
 */
public class _0187_重复的DNA序列 {
    public static void main(String[] args) {
        String s = "AAAAAAAAAAA";
        System.out.println(new _0187_重复的DNA序列().findRepeatedDnaSequences(s));
    }
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        int i = 0;
        int j = i+10;
        for (; j <= s.length(); j++,i++) {
            String temp = s.substring(i,j);
            if (set.add(temp)){
                continue;
            }else if (!list.contains(temp)){
                list.add(temp);
            }
        }
        return list;
    }
}
