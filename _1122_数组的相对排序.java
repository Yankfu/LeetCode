package com.LeetCode;

public class _1122_数组的相对排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {};
		int[] arr2= {};
		arr2=relativeSortArray(arr1,arr2);
	}

	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		int[] count = new int[1001];
		int[] res = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			count[arr1[i]]++;
		}
		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			while (count[arr2[i]] > 0) {
				res[index++] = arr2[i];
				count[arr2[i]]--;
			}
		}
		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				res[index++] = i;
				count[i]--;
			}
		}
		return res;
    }
}
