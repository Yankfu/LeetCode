package com.LeetCode;

public class _1131_绝对值表达式的最大值 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, -2, -5, 0, 10 };
		int[] arr2 = { 0, -2, -1, -7, -4 };
		System.out.println(maxAbsValExpr(arr1, arr2));
	}

	public static int maxAbsValExpr(int[] arr1, int[] arr2) {
		int maxA = Integer.MAX_VALUE;
		int minA = Integer.MIN_VALUE;
		int maxB = Integer.MAX_VALUE;
		int minB = Integer.MIN_VALUE;
		int maxC = Integer.MAX_VALUE;
		int minC = Integer.MIN_VALUE;
		int maxD = Integer.MAX_VALUE;
		int minD = Integer.MIN_VALUE;
		for (int i = 0; i < arr1.length; i++) {
			if (minA < arr1[i] + arr2[i] + i) {
				minA = arr1[i] + arr2[i] + i;
			}
			if (maxA > arr1[i] + arr2[i] + i) {
				maxA = arr1[i] + arr2[i] + i;
			}
			if (minB < arr1[i] + arr2[i] - i) {
				minB = arr1[i] + arr2[i] - i;
			}
			if (maxB > arr1[i] + arr2[i] - i) {
				maxB = arr1[i] + arr2[i] - i;
			}
			if (minC < arr1[i] - arr2[i] + i) {
				minC = arr1[i] - arr2[i] + i;
			}
			if (maxC > arr1[i] - arr2[i] + i) {
				maxC = arr1[i] - arr2[i] + i;
			}
			if (minD < arr1[i] - arr2[i] - i) {
				minD = arr1[i] - arr2[i] - i;
			}
			if (maxD > arr1[i] - arr2[i] - i) {
				maxD = arr1[i] - arr2[i] - i;
			}
		}
		int A = minA - maxA;
		int B = minB - maxB;
		int C = minC - maxC;
		int D = minD - maxD;
		return D > (C > (A > B ? A : B) ? C : (A > B ? A : B)) ? D : (C > (A > B ? A : B) ? C : (A > B ? A : B));
	}
}
