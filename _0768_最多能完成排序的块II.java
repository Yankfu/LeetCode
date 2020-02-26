package com.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/26 下午6:53
 * @Version 1.0
 */
public class _0768_最多能完成排序的块II {
	public static void main(String[] args) {

	}
	public int maxChunksToSorted(int[] arr) {
		Map<Integer, Integer> count = new HashMap();
		int ans = 0, nonzero = 0;

		int[] expect = arr.clone();
		Arrays.sort(expect);

		for (int i = 0; i < arr.length; ++i) {
			int x = arr[i], y = expect[i];

			count.put(x, count.getOrDefault(x, 0) + 1);
			if (count.get(x) == 0) nonzero--;
			if (count.get(x) == 1) nonzero++;

			count.put(y, count.getOrDefault(y, 0) - 1);
			if (count.get(y) == -1) nonzero++;
			if (count.get(y) == 0) nonzero--;

			if (nonzero == 0) ans++;
		}

		return ans;
	}
}
