package com.LeetCode;

public class _1342_将数字变成0的操作次数 {
    public static void main(String[] args) {
        System.out.print(numberOfSteps(14));
    }
    public static int numberOfSteps (int num) {
//        if(num == 0){
//            return 0;
//        }
//        if(num==1){
//            return 1;
//        }
//        if(num==2){
//            return 2;
//        }
        int res = 0;
        while(num>0){
            if(num%2==0){
                num = num / 2;
                res++;
            }else if(num%2==1){
                num = num -1;
                res++;
            }
        }
        return res;
    }
}
