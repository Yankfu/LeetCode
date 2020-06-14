package com.LeetCode;

import java.util.Arrays;

public class _1300_转变数组后最接近目标值的数组和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,9,3};
		int target = 10;
		System.out.println(findBestValue(arr,target));
	}

	/**
	 *
	 * @param arr
	 * @param target
	 * @return
	 */
	public static int findBestValue(int[] arr, int target) {
        int min = Integer.MAX_VALUE;
        int num = target/arr.length;
        int minIndex = num;

		for (int i = num; i < target; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > i) {
					sum += i;
				}else {
					sum += arr[j];
				}
			}

			if (Math.abs(target - sum) < min){
				min = Math.abs(target-sum);
				minIndex = i;
			}else {
				break;
			}
		}

		return minIndex;
    }
}
