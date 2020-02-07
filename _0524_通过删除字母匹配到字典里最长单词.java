package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0524_通过删除字母匹配到字典里最长单词 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("ale");
        li.add("apple");
        li.add("monkey");
        li.add("plea");
        String s = "abpcplea";
        System.out.println(findLongestWord(s,li));
    }
    public static String findLongestWord(String s, List<String> d) {
        String str = "";
        for(String sstr:d){
            for(int i = 0,j = 0;i<s.length()&&j<sstr.length();i++){
                if(s.charAt(i)==sstr.charAt(j)) j++;
                if(j == sstr.length()){
                    if(sstr.length() > str.length() || (sstr.length() == str.length() && str.compareTo(sstr) > 0)){
                        str = sstr;
                    }
                }
            }
        }
        return str;
    }
}
