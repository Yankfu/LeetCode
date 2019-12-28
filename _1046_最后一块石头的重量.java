package com.LeetCode;

import java.util.Arrays;

public class _1046_最后一块石头的重量 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(a));
	}
	public static int lastStoneWeight(int[] stones) {
		 if(stones.length==1){
	            return stones[0];
	        }
		Arrays.sort(stones);
        while(stones[stones.length-2]!=0) {
        	if(stones[stones.length-1]-stones[stones.length-2]==0) {
        		stones[stones.length-1]=0;
        		stones[stones.length-2]=0;
            }else if(stones[stones.length-1]-stones[stones.length-2]!=0) {
            	stones[stones.length-1]=stones[stones.length-1]-stones[stones.length-2];
            	stones[stones.length-2]=0;
            }
        	
        	Arrays.sort(stones);
        	for(int i:stones) {
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
		return stones[stones.length-1];
    }
}
