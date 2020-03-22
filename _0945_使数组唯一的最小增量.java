package com.LeetCode;

import java.util.Arrays;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/22 下午10:24
 * @Version 1.0
 */
public class _0945_使数组唯一的最小增量 {
	public static void main(String[] args) {

	}
	public static int minIncrementForUnique(int[] A) {
		Arrays.sort(A); // 先排序
		int curmax = -1; // 当前数组最大值
		int res = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= curmax) {
				int ai = curmax + 1; // 当前元素 A[i] 需要增加到 curmax + 1
				res += (ai - A[i]); // 记录自增次数
				A[i] = ai; // 增加当前元素
			}
			curmax = Math.max(curmax, A[i]);
		}
		return res;
	}
}
