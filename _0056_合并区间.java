package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
给出一个区间的集合，请合并所有重叠的区间。

示例 1:

输入: [[1,3],[2,6],[8,10],[15,18]]
输出: [[1,6],[8,10],[15,18]]
解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
示例 2:

输入: [[1,4],[4,5]]
输出: [[1,5]]
解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 */
public class _0056_合并区间 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,3},{8,10},{2,6},{15,18}};
		int[][] res = merge(intervals);
		for(int[] a:res) {
			System.out.println(a[0]+" "+a[1]);
		}
	}
	public static int[][] merge(int[][] intervals) {
		if (intervals.length == 0){
			return intervals;
		}
		List<int[]> list = new ArrayList();
		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
		for (int i = 0; i < intervals.length-1; i++) {
			if (intervals[i][1] >= intervals[i+1][0]){
				intervals[i+1][0] = intervals[i][0];
				intervals[i+1][1] = Math.max(intervals[i][1],intervals[i+1][1]);
			}else {
				list.add(intervals[i]);
			}
		}
		list.add(intervals[intervals.length-1]);
		return list.toArray(new int[list.size()][2]);
    }
}
