package com.LeetCode;

import java.util.Arrays;

public class _1051_高度检查器 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] heights= {1,1,4,2,1,3};
		System.out.println(heightChecker(heights));
	}

	/*
	 * 其实是个大坑，比的是排序速度。
	 * 上例        1 1 4 2 1 3
	 *排好序     1 1 1 2 3 4
	 *这样比较下来就有三个人没在正确的位置上，所以最简单的方法就是按照排好序的数组挨个比较并计数。
	 */
	public static int heightChecker(int[] heights) {
        int count=0;
        int[] right=heights.clone();
        Arrays.parallelSort(right);
        for(int i=0;i<heights.length;i++)
        {
        	if(heights[i]!=right[i])
        	{
        		count++;
        	}
        }
        return count;
    }
}
