package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/22 下午10:53
 * @Version 1.0
 */
public class _1357_每隔n个顾客打折 {
	public static void main(String[] args) {

		Cashier cashier = new Cashier(3,50,new int[]{1,2,3,4,5,6,7},new int[]{100,200,300,400,300,200,100});
		System.out.println(cashier.getBill(new int[]{1,2},new int[]{1,2}));                      // 返回 500.0, 账单金额为 = 1 * 100 + 2 * 200 = 500.
		System.out.println(cashier.getBill(new int[]{3,7},new int[]{10,10}));                      // 返回 500.0, 账单金额为 = 1 * 100 + 2 * 200 = 500.
		System.out.println(cashier.getBill(new int[]{1,2,3,4,5,6,7},new int[]{1,1,1,1,1,1,1}));                      // 返回 500.0, 账单金额为 = 1 * 100 + 2 * 200 = 500.
		System.out.println(cashier.getBill(new int[]{4},new int[]{10}));                      // 返回 500.0, 账单金额为 = 1 * 100 + 2 * 200 = 500.
		System.out.println(cashier.getBill(new int[]{7,3},new int[]{10,10}));                      // 返回 500.0, 账单金额为 = 1 * 100 + 2 * 200 = 500.
		System.out.println(cashier.getBill(new int[]{7,5,3,1,6,4,2},new int[]{10,10,10,9,9,9,7}));                      // 返回 500.0, 账单金额为 = 1 * 100 + 2 * 200 = 500.
//		cashier.getBill({3,7},{10,10});                      // 返回 4000.0
//		cashier.getBill({1,2,3,4,5,6,7},{1,1,1,1,1,1,1});    // 返回 800.0 ，账单原本为 1600.0 ，但由于该顾客是第三位顾客，他将得到 50% 的折扣，所以实际金额为 1600 - 1600 * (50 / 100) = 800 。
//		cashier.getBill({4},{10});                           // 返回 4000.0
//		cashier.getBill({7,3},{10,10});                      // 返回 4000.0
//		cashier.getBill({7,5,3,1,6,4,2},{10,10,10,9,9,9,7}); // 返回 7350.0 ，账单原本为 14700.0 ，但由于系统计数再次达到三，该顾客将得到 50% 的折扣，实际金额为 7350.0 。
//		cashier.getBill({2,3,5},{5,3,2});                    // 返回 2500.0
	}

	static class Cashier {
		int count = 0;
		int n = 0;
		int discount;
		int[] products;
		int[] prices;
		Map<Integer,Integer> map = new HashMap<>();
		public Cashier(int n, int discount, int[] products, int[] prices) {
			this.n = n;
			this.discount = discount;
			this.products = products;
			this.prices = prices;
			for (int i = 0; i < prices.length; i++) {
				map.put(products[i],prices[i]);
			}
		}

		public double getBill(int[] product, int[] amount) {
			count++;
			int pres = 0;
			if(count == n){
				for (int i = 0; i < product.length; i++) {
					pres += map.get(product[i])*amount[i];
				}
				count = 0;
				return (pres-pres*((double)discount/100.0));
			}else{
				for (int i = 0; i < product.length; i++) {
					pres += map.get(product[i])*amount[i];
				}
				return pres;
			}
		}
	}

}