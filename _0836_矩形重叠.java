package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/18 下午10:35
 * @Version 1.0
 */
public class _0836_矩形重叠 {
	public static void main(String[] args) {

	}
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		boolean x_overlap = !(rec1[2] <= rec2[0] || rec2[2] <= rec1[0]);
		boolean y_overlap = !(rec1[3] <= rec2[1] || rec2[3] <= rec1[1]);
		return x_overlap && y_overlap;
	}
}
