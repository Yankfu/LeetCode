package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0077_组合 {
    public static void main(String[] args) {
        List<List<Integer>> li = new ArrayList<>();
        li = combine(4,2);
        for(List i:li){
            System.out.println(i);
        }
    }
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> list = new ArrayList<>();
    public static List<List<Integer>> combine(int n, int k) {
        backTrack(0,n,k,list,Integer.MIN_VALUE);
        return res;
    }
    public static void backTrack(int deep,int n,int k,List<Integer> li,int pre){
        if(deep == k){
//            System.out.println(li);
            res.add(new ArrayList<>(li));
        }else{
            for(int i = 1;i<=n;i++){
                if(i>pre){
                    li.add(i);
                    backTrack(deep+1,n,k,li,i);
                    li.remove(li.size()-1);
                }
            }
        }
    }
}
