package com.LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/11 22:55
 */
public class _面试题_50_第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> dic = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc) {
            dic.put(c, !dic.containsKey(c));
        }
        for(Map.Entry<Character, Boolean> d : dic.entrySet()){
            if(d.getValue()) {
                return d.getKey();
            }
        }
        return ' ';
    }
}
