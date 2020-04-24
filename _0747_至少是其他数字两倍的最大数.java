package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/23 23:38
 */
public class _0747_至少是其他数字两倍的最大数 {
    public static void main(String[] args) {
        int[] nums = {0,0,3,2};
        System.out.println(new _0747_至少是其他数字两倍的最大数().dominantIndex(nums));
    }
    public int dominantIndex(int[] nums) {
        int res = -1;
        for (int i = 0;i<nums.length;++i){
            if (nums[i] > nums[res])
                res = i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (res != i && nums[res] < 2 * nums[i])
                return -1;
        }
        return res;
    }
}
