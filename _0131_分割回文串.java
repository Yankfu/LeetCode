package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0131_分割回文串 {
    public static void main(String[] args) {
        String s = "aabacbcaddb";
        List<List<String>> res = new ArrayList<>();
        res = partition(s);
        for(List<String> li:res){
            System.out.println(li);
        }
    }
    static List<List<String>> res = new ArrayList<>();
    public static List<List<String>> partition(String s) {
        List<String> list = new ArrayList<>();
        backTrack(s,list);
        return res;
    }
    public static void backTrack(String s,List<String> list){
        if(s.length() == 0){
            res.add(new ArrayList<>(list));
        }else{
            for(int i = 1;i<=s.length();i++){
                if(isHuiWen(s.substring(0,i))){
                    list.add(s.substring(0,i));
//                    System.out.println(s.substring(i)+"   s: "+s+"   ");
                    backTrack(s.substring(i),list);
                    list.remove(list.size()-1);
                }
            }
        }
    }
    public static boolean isHuiWen(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}
//[
//        ["a","a","b","a","c","b","c","a","d","d","b"],
//        ["a","a","b","a","c","b","c","a","dd","b"],
//        ["a","a","b","a","cbc","a","d","d","b"],
//        ["a","a","b","a","cbc","a","dd","b"],
//        ["a","a","b","acbca","d","d","b"],
//        ["a","a","b","acbca","dd","b"],
//        ["a","aba","c","b","c","a","d","d","b"],
//        ["a","aba","c","b","c","a","dd","b"],
//        ["a","aba","cbc","a","d","d","b"],
//        ["a","aba","cbc","a","dd","b"],
//        ["aa","b","a","c","b","c","a","d","d","b"],
//        ["aa","b","a","c","b","c","a","dd","b"],
//        ["aa","b","a","cbc","a","d","d","b"],
//        ["aa","b","a","cbc","a","dd","b"],
//        ["aa","b","acbca","d","d","b"],
//        ["aa","b","acbca","dd","b"]
//        ]