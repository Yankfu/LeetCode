package com.LeetCode;

public class _1217_玩筹码 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int minCostToMoveChips(int[] chips) {
        int i=chips.length;
        int count=0;
        for(int j=0;j<i;j++) {
        	if(j%2==0) {
        		count++;
        	}else {
        		
        	}
        }
		return count>i-count?i-count:count;
    }
}
