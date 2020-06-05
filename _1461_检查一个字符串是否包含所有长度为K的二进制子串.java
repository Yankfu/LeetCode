package com.LeetCode;

import java.util.HashSet;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/4 22:28
 */
public class _1461_检查一个字符串是否包含所有长度为K的二进制子串 {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= s.length()-k; i++) {
            set.add(s.substring(i,i+k));
        }
        return set.size() == (int)Math.pow(2,k);
    }
}
