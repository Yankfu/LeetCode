package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/19 22:30
 */
public class _剑指_Offer_57_和为s的两个数字 {
    /**
     * 对撞双指针，一个从左到右，一个从右到左，其实就是排序多维数组中找目标值的感觉
     * 大于现在的你右边肯定都大于，所以抛弃，小于的左边同理
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int s = nums[i] + nums[j];
            if(s < target) {
                i++;
            } else if(s > target) {
                j--;
            } else {
                return new int[] { nums[i], nums[j] };
            }
        }
        return new int[0];
    }
}
