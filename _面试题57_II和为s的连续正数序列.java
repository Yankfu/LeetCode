package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/6 上午9:50
 * @Version 1.0
 */
public class _面试题57_II和为s的连续正数序列 {
	public static void main(String[] args) {
		int[][] res = findContinuousSequence(9);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] findContinuousSequence(int target) {
		List<Integer> li = new ArrayList<>();
		int low = 0;
		int high = 1;
		int count = 1;
		while (low<target && low < high){
			if (count == target){
				low++;
				if (low == high){
					break;
				}
				li.add(low);
				li.add(high);
				count -= low;
			} else if (count < target) {
				high++;
				count += high;
			} else if (count > target) {
				low++;
				count -= low;
			}
		}
		int[][] res = new int[li.size()/2][];
		int j = 0;
		for (int i = 0; i < li.size(); i = i+2) {
			int l = 0;
			res[j] = new int[li.get(i+1)-li.get(i)+1];
			for (int k = li.get(i); k <= li.get(i+1); k++) {
				res[j][l++] = k;
			}
			j++;
		}
		return res;
	}
}
