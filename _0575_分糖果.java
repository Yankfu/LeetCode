package com.LeetCode;

import java.util.Arrays;

public class _0575_分糖果 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int distributeCandies(int[] candies) {
        Arrays.parallelSort(candies);
		int count=1;
		for (int i = 1; i < candies.length && count < candies.length / 2; i++)
            if (candies[i] > candies[i - 1])
                count++;
		return count;
    }
}
