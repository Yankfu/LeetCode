package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/20 18:34
 */
public class _1451_重新排列句子中的单词 {
    //5413. 重新排列句子中的单词
    public static String arrangeWords(String text) {
        String[] s = text.split(" ");
//        Map<Integer,String> map = new HashMap<>();
//        Map<Integer,Integer> index = new HashMap<>();
        int[] length = new int[s.length];
        for (int i = 0; i < s.length; i++) {
//            map.put(i,s[i].toLowerCase());
//            index.put(s[i].length(),i);
            s[i] = s[i].toLowerCase();
            length[i] = s[i].length();
        }
        Arrays.sort(length);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j].length() == length[i]){
                    sb.append(s[j]).append(" ");
                    s[j] = "";
                    break;
                }
            }
        }
        char rep = (char) (sb.charAt(0)-32);
        sb.replace(0, 1, rep+"");
        String res = sb.toString();
        res = res.substring(0,res.length()-1);
        return res;
    }
}
