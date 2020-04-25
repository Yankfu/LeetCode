package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/25 10:10
 */
public class _1417_重新格式化字符串 {
    //重新格式化字符串
    public String reformat(String s) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        List<Character> num = new ArrayList<>();
        List<Character> letter = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='0' && ch[i]<='9'){
                num.add(ch[i]);
            }else {
                letter.add(ch[i]);
            }
        }
        if (Math.abs((num.size() - letter.size()))>1) {
            return "";
        }
        if (num.size() >= letter.size()){
            int index = 0;
            while (index < letter.size()){
                sb.append(num.get(index)).append(letter.get(index));
                index++;
            }
            if (index == num.size()-1){
                sb.append(num.get(index));
            }
        }else {
            int index = 0;
            while (index < num.size()){
                sb.append(letter.get(index)).append(num.get(index));
                index++;
            }
            if (index == letter.size()-1){
                sb.append(letter.get(index));
            }
        }
        return sb.toString();
    }
}
