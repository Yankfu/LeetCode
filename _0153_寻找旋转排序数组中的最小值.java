package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/5 20:25
 */
public class _0153_寻找旋转排序数组中的最小值 {
    public static void main(String[] args) {

    }
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int left = 0;
        int right = nums.length-1;
        if (nums[right] > nums[0]) {
            return nums[0];
        }
        while (left <= right) {

            int mid = left + (right - left)/2;

            if (nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if (nums[mid-1]>nums[mid]){
                return nums[mid];
            }

            //组内元素保持有序
            if(nums[0]<nums[mid]){
                left = mid+1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
