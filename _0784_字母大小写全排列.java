package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0784_字母大小写全排列 {
    public static void main(String[] args) {
        String S = "";
        List<String> list = letterCasePermutation(S);
        for(String str:list){
            System.out.println(str);
        }
    }
    public static List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        S = S.toLowerCase();
        char[] ch = S.toCharArray();
        backTrack(ch,0,list);
        return list;
    }
    public static void backTrack(char[] ch,int now,List<String> list){
        if(now==ch.length){
            list.add(new String(ch));
        }else{
            if(ch[now]>='0' && ch[now]<='9'){
                backTrack(ch,now+1,list);
            }else{
                backTrack(ch,now+1,list);
                ch[now] = (char)(ch[now]-32);
                backTrack(ch,now+1,list);
                ch[now] = (char)(ch[now]+32);
            }
        }
    }
}
