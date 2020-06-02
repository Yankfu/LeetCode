package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/28 10:03
 */
public class _0350_两个数组的交集II {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<nums1.length && j<nums2.length){
            if (nums1[i]<nums2[j]){
                ++i;
            }else if (nums1[i]>nums2[j]){
                ++j;
            }else {
                nums1[k++] = nums1[i++];
                ++j;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
