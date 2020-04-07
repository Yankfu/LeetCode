package com.LeetCode;

import java.util.*;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/7 21:56
 */
public class _面试题_16_20_T9键盘 {
    public static void main(String[] args) {

    }
    public static List<String> getValidT9Words(String num, String[] words) {
        List<String> list = new ArrayList<>();
        char[] mm= {'2', '2', '2', '3', '3', '3', '4', '4', '4',
                '5', '5', '5', '6', '6', '6', '7', '7', '7',
                '7', '8', '8', '8', '9', '9', '9', '9'};
        for (String word : words) {
            boolean find = true;
            for (int i = 0; i < word.length(); i++) {
                if (mm[word.charAt(i) - 'a'] != num.charAt(i)) {
                    find = false;
                    break;
                }
            }
            if (find) list.add(word);
        }
        return list;
    }
}
