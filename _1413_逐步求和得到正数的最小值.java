package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/25 10:10
 */
public class _1413_逐步求和得到正数的最小值 {
    //逐步求和得到正数的最小值
    public int minStartValue(int[] nums) {
        int[] temp = new int[nums.length];
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            count = count + nums[i];
            temp[i] = count;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]<min){
                min = temp[i];
            }
        }
        if (min>0) return 1;
        return 0-min+1;
    }
}
