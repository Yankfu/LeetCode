package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0017_电话号码的字母组合 {
    public static void main(String[] args) {
        List<String> li = letterCombinations("23");
        for(String str:li){
            System.out.println(str);
        }
    }
    public static char[][] letters = {
            {},
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}
    };
    public static List<String> li = new ArrayList<>();
    public static List<String> letterCombinations(String digits) {
        if(digits.length() != 0){
            build(digits,0,"");
        }
        return li;
    }
    public static void build(String digits,int point,String now){
        if(point == (digits.length())) {
            li.add(now);
            return ;
        }
        int number = digits.charAt(point)-'0';
        if(number == 1){
            build(digits,point+1,now);
        }else{
            for(int i = 0;i<letters[number-1].length;i++){
                point = point + 1;
                //System.out.println("number: "+number+" i: "+i+" letter: "+letters[number-1][i]);
                now = now + letters[number-1][i];
                build(digits,point,now);
                point = point - 1;
                now = now.substring(0,now.length()-1);
            }
        }
        return ;
    }
}
