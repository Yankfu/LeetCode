package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/19 21:25
 */
public class _1408_数组中的字符串匹配 {
    //数组中的字符串匹配
    public static List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].indexOf(words[i]) != -1 && i != j) {
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
    }
}
