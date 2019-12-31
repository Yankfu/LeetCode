package com.LeetCode;

public class _0122_买卖股票的最佳时机II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {2,1};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		if(prices.length==1) {
			return 0;
		}
        int result=0;
		for(int i=1;i<prices.length;i++) {
        	if(prices[i]>prices[i-1]) {
        		result=result+(prices[i]-prices[i-1]);
        	}else {
        		continue;
        	}
        }
		return result;
    }
}
