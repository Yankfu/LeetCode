package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/20 18:42
 */
public class _1447_最简分数 {
    //5397. 最简分数
    public static List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (gcb(i,j)){
                    //System.out.println(j+"\\"+i);
                    res.add(j+"\\"+i);
                }
            }
        }
        return res;
    }
    public static boolean gcb(int a,int b){
        while(a%b!=0){
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        if (b == 1){
            return true;
        }else {
            return false;
        }
    }
}
