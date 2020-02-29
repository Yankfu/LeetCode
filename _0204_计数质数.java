package com.LeetCode;

import java.util.Arrays;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/29 上午11:34
 * @Version 1.0
 */
public class _0204_计数质数 {
	public static void main(String[] args) {
		System.out.println(countPrimes(10));
	}
	public static int countPrimes(int n) {
		int res = 0;
		boolean[] isPrimes = new boolean[n];
		Arrays.fill(isPrimes,true);
		for (int i = 2; i * i < n; i++) {
			if(isPrimes[i]){
				for (int j = i*i; j < n; j = j+i) {
					isPrimes[j] = false;
				}
			}
		}
		for (int i = 2; i < n; i++) {
			if (isPrimes[i]){
				res++;
			}
		}
		return res;
	}
}
