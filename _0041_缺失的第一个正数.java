package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/22 21:28
 */
public class _0041_缺失的第一个正数 {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(new _0041_缺失的第一个正数().firstMissingPositive(nums));
    }
    public int firstMissingPositive(int[] nums) {
        boolean hasOne = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                hasOne = true;
            }
            if (nums[i]<=0 || nums[i]>nums.length){
                nums[i] = 1;
            }
        }
        if (!hasOne){
            return 1;
        }

        for (int i = 0; i < nums.length; i++) {
            int a = Math.abs(nums[i]);
            // 如果发现了一个数字 a - 改变第 a 个元素的符号
            // 注意重复元素只需操作一次
            if (a == nums.length)
                nums[0] = - Math.abs(nums[0]);
            else
                nums[a] = - Math.abs(nums[a]);
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>0){
                return i;
            }
        }
        if (nums[0]>0){
            return nums.length;
        }
        return nums.length+1;
    }
}
