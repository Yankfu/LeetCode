package com.LeetCode;

public class _0042_接雨水 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {};
		System.out.println(trap(height));
	}

	public static int trap(int[] height) {
		int res = 0;
		int big = Integer.MIN_VALUE;
		for (int i = 0; i < height.length; i++) {
			if (height[i] > big) {
				big = height[i];
			}
		}
		int low;
		int fast;
		while (big > 0) {
//			for (int i = 0; i < height.length; i++) {
//				System.out.print(height[i] + " ");
//			}
//			System.out.println();
			low = 0;
			fast = 0;
			while (low < height.length - 1) {
				if (height[low] == 0) {
				} else if (height[low] > 0 && height[low + 1] > 0) {
					height[low]--;
				} else if (height[low] > 0 && height[low + 1] == 0) {
					height[low]--;
					fast = low + 1;
					while (fast < height.length && height[fast] == 0) {
						fast++;
					}
					// System.out.println(fast - low - 1+" "+fast+" "+low);
					if (fast == height.length) {
						low++;
						continue;
					}
					res = res + (fast - low - 1);
				}
				low++;
			}
			if (height[height.length - 1] > 0) {
				height[height.length - 1]--;
			}
			big--;
		}
		return res;
	}
}
