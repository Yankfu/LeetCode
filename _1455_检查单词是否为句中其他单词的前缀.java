package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/31 23:11
 */
public class _1455_检查单词是否为句中其他单词的前缀 {
    //5416. 检查单词是否为句中其他单词的前缀
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] str = sentence.split(" ");
        int i;
        boolean has = false;
        for (i = 0; i < str.length; i++) {
            if (str[i].indexOf(searchWord) == 0){
                has = true;
                break;
            }
        }
        if (has){
            return i+1;
        }
        return -1;
    }
}
