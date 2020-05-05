package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/5 21:00
 */
public class _0152_乘积最大子数组 {
    public static void main(String[] args) {

    }
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int tempMax = 1;
        int tempMin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0){
                int temp = tempMax;
                tempMax = tempMin;
                tempMin = temp;
            }

            tempMax = Math.max(tempMax*nums[i],nums[i]);
            tempMin = Math.min(tempMin*nums[i],nums[i]);

            res = Math.max(tempMax,res);
        }
        return res;
    }
}
