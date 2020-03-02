package com.LeetCode;

public class _1344_时钟指针的夹角 {
    public static void main(String[] args) {
        int hour = 1;
        int minutes = 57;
        System.out.print(angleClock(hour,minutes));
    }
    public static double angleClock(int hour, int minutes) {
        double res = 0;
        double h = (hour * 30 + minutes*0.5)%360;
        double m = minutes*6;
        if(h>m){
            res = h-m;
        }else{
            res = m-h;
        }
        return res>(360-res)?(360-res):res;
    }
}
