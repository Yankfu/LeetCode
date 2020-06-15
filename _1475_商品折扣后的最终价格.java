package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/15 22:47
 */
public class _1475_商品折扣后的最终价格 {
    //商品折扣后的最终价格

    /**
     *
     * @param prices
     * @return
     */
    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int temp = 0;
            res[i] = prices[i];
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j]<=prices[i]){
                    res[i] = prices[i]-prices[j];
                    break;
                }
            }
        }
        return res;
    }
}
