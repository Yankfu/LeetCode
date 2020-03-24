package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/17 下午10:57
 * @Version 1.0
 */
public class _面试题_08_03_魔术索引 {
	public static void main(String[] args) {
		int[] nums = {0,2,4,5,6};
		System.out.println(findMagicIndex(nums));
	}
	public static int findMagicIndex(int[] nums) {
		int left = 0;
		int right = nums.length;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] != mid) {
				if (nums[mid] >= 0) {
					right = mid;
				}else {
					left = mid +1;
				}
			} else {
				left = mid + 1;
			}
		}
		return left-1;
	}
}
