package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0022_括号生成 {
    public static void main(String[] args) {
        List<String> li = generateParenthesis(2);
        for(String a:li){
            System.out.println(a);
        }
    }

    static List<String> li = new ArrayList<>();

    public static List<String> generateParenthesis(int n) {
        if(n==0){
            return li;
        }
        backTrack("", n, n);
        return li;
    }

    public static void backTrack(String now, int left, int right) {
        if (left == 0 && right == 0) {
            li.add(now);
            return;
        } else {
            for (int i = 0; i < 2; i++) {
                if(i==0 && left!=0){
                    backTrack((now+"("),left-1,right);
                }else if(i == 1 && left < right) {
                    backTrack((now+")"),left,right-1);
                }
            }
        }
    }
}
