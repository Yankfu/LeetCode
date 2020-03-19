package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/19 下午9:27
 * @Version 1.0
 */
public class _0409_最长回文串 {
	public static void main(String[] args) {

	}
	public int longestPalindrome(String s) {
		int res = 0;
		int[] count = new int[128];
		for (char ch : s.toCharArray()) {
			count[ch]++;
		}
		for (int i = 0; i < count.length; i++) {
			res = res + ( count[i] / 2 * 2);
			if (res % 2 == 0 && count[i] % 2 ==1) {
				res++;
			}
		}
		return res;
	}
}
