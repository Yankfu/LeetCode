package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/24 23:17
 */
public class _0238_除自身以外数组的乘积 {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i-1]*res[i-1];
        }
        int R = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            res[i] = res[i]*R;
            R *= nums[i];
        }
        return res;
    }
}
