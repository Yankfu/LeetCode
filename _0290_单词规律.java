package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/23 23:14
 */
public class _0290_单词规律 {
    public static void main(String[] args) {

    }
    public boolean wordPattern(String pattern, String str) {
        char[] ch = pattern.toCharArray();
        String[] array = str.split(" ");
        if (ch.length!=array.length){
            return false;
        }
        Map<Character,String> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if(map.containsKey(ch[i])){
                if(!map.get(ch[i]).equals(array[i])){
                    return false;
                }
            }else{
                //判断 value 中是否存在
                if(map.containsValue(array[i])){
                    return false;
                }
                map.put(ch[i], array[i]);
            }
        }
        return true;
    }
}
