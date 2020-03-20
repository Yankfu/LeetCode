package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/20 下午10:03
 * @Version 1.0
 */
public class _面试题40_最小的k个数 {
	public static void main(String[] args) {

	}
	public int[] getLeastNumbers(int[] arr, int k) {
		if (arr.length == 0 || k == 0) return new int[0];
		int[] count = new int[10001];
		for (int num: arr) {
			count[num]++;
		}
		int[] res = new int[k];
		int idx = 0;
		for (int num = 0; num < count.length; num++) {
			while (count[num]-- > 0 && idx < k) {
				res[idx++] = num;
			}
			if (idx == k) {
				break;
			}
		}
		return res;
	}
}
