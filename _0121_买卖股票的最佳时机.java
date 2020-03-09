package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/9 上午10:07
 * @Version 1.0
 */
public class _0121_买卖股票的最佳时机 {
	public static void main(String[] args) {
		int[] prices = {7,6,4,3,1};
		System.out.print(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		int res = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min){
				min = prices[i];
			}
			if (res<prices[i]-min){
				res = prices[i]-min;
			}
		}
		return res;
	}
}
