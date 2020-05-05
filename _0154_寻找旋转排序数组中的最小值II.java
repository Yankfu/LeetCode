package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/5 20:45
 */
public class _0154_寻找旋转排序数组中的最小值II {
    public static void main(String[] args) {

    }
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (nums[mid] < nums[right]){
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid+1;
            }else {
                right--;
            }
        }
        return nums[left];
    }
}
