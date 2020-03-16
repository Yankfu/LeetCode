package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/16 下午8:51
 * @Version 1.0
 */
public class _0744_寻找比目标字母大的最小字母 {
	public static void main(String[] args) {

	}
	public static char nextGreatestLetter(char[] letters, char target) {
		int left = 0;
		int right = letters.length;
		while(left < right){
			int mid = left + (right-left)/2;
			if (letters[mid] <= target) {
				left = mid + 1;
			}
			else right = mid;
		}
		return letters[left % letters.length];
	}
}
