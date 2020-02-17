package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0089_格雷编码 {
    public static void main(String[] args) {
        System.out.println(grayCode(3));
    }
    public static List<Integer> grayCode(int n) {
        List<Integer> li = new ArrayList<>();
        if(n==0){
            li.add(0);
            return li;
        }
        backTrack(n,0,li,0,0);
        return li;
    }
    public static void backTrack(int n,int now,List li,int num,int FUCK){
        if(now == n){
            li.add(num);
        }
        else{
            if(FUCK == 0){
                num = num << 1;
                backTrack(n,now+1,li,num,0);
                num = num >>> 1;
                num = num << 1;
                num = num|1;
                backTrack(n,now+1,li,num,1);
            }else if(FUCK == 1){
                num = num << 1;
                num = num|1;
                backTrack(n,now+1,li,num,0);
                num = num >>> 1;
                num = num << 1;
                backTrack(n,now+1,li,num,1);
            }
        }
    }
}
