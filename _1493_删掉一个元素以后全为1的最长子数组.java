package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/7/3 23:12
 */
public class _1493_删掉一个元素以后全为1的最长子数组 {
    //删掉一个元素以后全为 1 的最长子数组

    /**
     * 双指针扫一遍。
     * 具体情况分为
     * 先记录最长的1的个数
     * 如果碰到了0，预判0的下一位是否越界或者为1或者为0
     * 如果是1的话
     *     记录0的位置，直到下一次碰到0把left更新到0的位置
     * 如果是0的话就同时移动left和0
     *
     * 1111 0 1111
     *     如果这样就记录0的位置和1的开头
     * 1111 0000 1111
     *     这样就把0的位置一直给后移，顺便移动left指针
     * @param nums
     * @return
     */
    public int longestSubarray(int[] nums) {
        int res = Integer.MIN_VALUE;
        boolean hasZero = false;
        int left = 0;
        int right = left;
        while (left < nums.length && right < nums.length){
            if (nums[right] == 1){
                right++;
            }else if (nums[right] == 0){
                if (hasZero){
                    //如果已经有0了，就需要计算结果然后移动left减少0
                    res = Math.max(left-right-1,res);
                    while (nums[left]!=0){
                        left++;
                    }
                    left++;
                    hasZero = false;
                }else {
                    hasZero = true;
                    right++;
                }
            }
        }
        res = Math.max(left-right-1,res);
        return res;
    }
}
