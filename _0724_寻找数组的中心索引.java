package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/12 23:22
 */
public class _0724_寻找数组的中心索引 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        if (nums.length == 0){
            return -1;
        }
        int right = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
        }
        int pre = 0;
        System.out.println(left+"  "+right);
        for (int i = 0; i < nums.length; i++) {
            left += pre;
            pre = nums[i];
            right -= nums[i];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
