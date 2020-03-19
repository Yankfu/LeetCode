package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/19 下午9:50
 * @Version 1.0
 */
public class _1380_矩阵中的幸运数 {
	public static void main(String[] args) {

	}
	public static List<Integer> luckyNumbers (int[][] matrix) {
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < matrix.length; i++) {
			int big = Integer.MAX_VALUE;
			int index = 0;
			boolean isBig = true;
			//寻找最小的
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < big){
					index = j;
					big = matrix[i][j];
				}
			}
			//按列寻找最大的
			for (int j = 0; j < matrix.length; j++) {
				if (i == j){
					continue;
				}else if (matrix[i][index] < matrix[j][index]){
					isBig = false;
					break;
				}
			}
			if (isBig){
				li.add(matrix[i][index]);
			}
		}
		return li;
	}
}
