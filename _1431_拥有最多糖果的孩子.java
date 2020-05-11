package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/11 15:54
 */
public class _1431_拥有最多糖果的孩子 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int big = 0;
        for(int temp:candies){
            if (temp>big){
                big = temp;
            }
        }
        List<Boolean> li = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies>=big){
                li.add(true);
            }else {
                li.add(false);
            }
        }
        return li;
    }
}
