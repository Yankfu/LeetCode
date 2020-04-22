package com.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/22 21:06
 */
public class _0030_串联所有单词的子串 {
    public static void main(String[] args) {

    }
    public List<Integer> findSubstring(String s, String[] words) {
        if(s==null || "".equals(s) || words==null || words.length==0) {
            return new ArrayList<Integer>();
        }
        List<Integer> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }else {
                map.put(words[i],1);
            }
        }
        int wordLen = words[0].length();
        int allWordLen = wordLen*words.length;
        for (int i = 0; i < s.length()-allWordLen+1; i++) {
            String temp = s.substring(i,i+allWordLen);
            Map<String,Integer> tempMap = new HashMap<>(map);
            for (int j = 0; j < temp.length(); j+=wordLen) {
                String key = temp.substring(j,j+wordLen);
                if (tempMap.containsKey(key)){
                    tempMap.put(key,tempMap.get(key)-1);
                    if(tempMap.get(key)==0) {
                        tempMap.remove(key);
                    }
                }else {
                    break;
                }
            }
            if (tempMap.size() == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
