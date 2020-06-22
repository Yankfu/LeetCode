package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/15 22:51
 */
public class _1482_制作m束花所需的最少天数 {
    /**
     * 先找到开花时间最长的，然后分块，如果满足把res设置成这天，就找下一天，重复分块操作。×
     * 因为天数是线性的，所以一次可以砍掉一般符合或者不符合要求的天数
     * @param bloomDay
     * @param m
     * @param k
     * @return
     */
    //制作 m 束花所需的最少天数
    public int minDays(int[] bloomDay, int m, int k) {
        if (m*k > bloomDay.length){
            return -1;
        }

        int max = 0;
        for (int i:bloomDay){
            max = Math.max(max,i);
        }
        int min = 0;
        while (min < max){
            int mid = min + (max-min)/2;
            int count = getCount(bloomDay,mid,k);
            if (count >= m) {
                max = mid;
            }else {
                min = mid+1;
            }
        }
        return min;
    }

    public int getCount(int[] arr,int day,int k){
        int re = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day){
                count++;
            }else {
                count = 0;
            }
            if (count == k) {
                re++;
                count=0;
            }
        }
        return re;
    }
}
