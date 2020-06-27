package com.LeetCode;

import java.util.HashSet;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/23 9:23
 */
public class _1488_避免洪水泛滥 {
    /**
     * 如果mid小于雨天的值，left = mid;
     * 如果mid大于雨天的值，right = mid;
     * 最后返回的是
     * @return
     */
    /**
     * 试着按照正常思路走一遍
     * 贪心？
     * 天晴要先预警，看之后第一次下雨要发洪水的是哪个，如果有就清空set，如果没有就置1
     * 下雨的话就给set里面放，发现有了就返回new int{};
     *
     * 可以把所有的扔进set，然后找中间的0，有的话-1
     * @param rains
     * @return
     */
    public int[] avoidFlood(int[] rains) {
        //如果连着两天下雨，直接返回空
        for (int i = 1; i < rains.length; i++) {
            if (rains[i]!=0 && rains[i] == rains[i-1]){
                return new int[]{};
            }
        }

        int[] res = new int[rains.length];
        //用来放装满水的池子
        HashSet<Integer> full = new HashSet<>();
        for (int i = 0; i < rains.length; i++) {
            //如果下雨
            if (rains[i] != 0){
                //如果没被清空直接返回空字符串
                if (full.contains(rains[i])){
                    return new int[]{};
                }else {
                    full.add(rains[i]);
                }
                res[i] = -1;
            }else {
                boolean isPut = false;
                for (int j = i; j < rains.length; j++) {
                    //找第一个下雨且 存在危险（已经满了的池子）
                    if (rains[j] != 0 && full.contains(rains[j])){
                        res[i] = rains[j];
                        full.remove(rains[j]);
                        isPut = true;
                        break;
                    }
                }
                //如果执行到这里
                if (!isPut){
                    res[i] = 1;
                }
            }
        }

        return res;
    }
}
