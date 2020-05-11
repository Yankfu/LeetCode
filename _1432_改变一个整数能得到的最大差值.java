package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/11 15:53
 */
public class _1432_改变一个整数能得到的最大差值 {
    public int maxDiff(int num) {
        List<Integer> list = new ArrayList<>();

        while (num!=0){
            list.add(num%10);
            num = num/10;
        }

        //确定最大的
        int big = isBig(list);
        int small = isSmall(list);
        System.out.println(big +"  "+small);
        return big - small;
    }
    public int isBig(List<Integer> list){
        int res = 0;

        int temp = 0;
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) == 9){
                continue;
            }else {
                temp = list.get(i);
                break;
            }
        }
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) == temp){
                res = res*10+9;
            }else {
                res = res*10+list.get(i);
            }
        }

        return res;
    }
    public int isSmall(List<Integer> list){
        int res = 0;

        int temp = 0;
        int temp2 = 0;
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) == 1 || list.get(i) == 0){
                continue;
            }else {
                temp = list.get(i);

                temp2 = i;
                break;
            }
        }

        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) == temp){
                if (temp2 == list.size()-1){
                    res = res*10+1;
                }else {
                    res = res*10+0;
                }
            }else {
                res = res*10+list.get(i);
            }
        }

        return res;
    }
}
