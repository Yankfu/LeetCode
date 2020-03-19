package com.LeetCode;

import java.util.Arrays;

public class _0322_零钱兑换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2};
		int amount = 3;
		System.out.println(coinChange(coins, amount));
	}

	/*
	 * 分支界限法 剪枝
	 */
	public static int coinChange(int[] coins, int amount) {
		if (amount < 0) {
			return -1;
		}
		if (amount == 0) {
			return 0;
		}

		int[] res = new int[amount + 1];
		for (int i = 1; i <= amount; i++) { // i代表着当前的总价应该是多少
			int cost = Integer.MAX_VALUE;
			for (int j = 0; j < coins.length; j++) {
				// System.out.print(i);
				if (i - coins[j] >= 0) {// i-coins[j]代表着当前总价如果减去硬币价值的话会不会越界
					if (res[i - coins[j]] != Integer.MAX_VALUE) {// 如果当前总价减去硬币价值后的硬币枚数不等于最大值，就认为是合法的，不然就认为之前都没有路径可以到达
						cost = Math.min(cost, res[i - coins[j]] + 1);//
					}
				}
			}
			res[i] = cost;
		}
		if (res[amount] == Integer.MAX_VALUE) {
			return -1;
		}
		return res[amount];
	}
}
/**
class DaLaoSolution {
	private int res = Integer.MAX_VALUE;

	public int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		helper(coins, coins.length - 1, 0, amount);
		return res == Integer.MAX_VALUE ? -1 : res;
	}

	private void helper(int[] coins, int start, int cur, int amount) {
		if (start < 0) return;
		if (amount % coins[start] == 0) {
			res = Math.min(res, cur + amount / coins[start]);
			return;
		}
		for (int i = amount / coins[start]; i >= 0; i--) {
			// System.out.println("cur = " + cur + ", i = " + i + ", res = " + res);
			if (cur + i >= res - 1) break;
			helper(coins, start - 1, cur + i, amount - i * coins[start]);
		}
	}
}
 */
