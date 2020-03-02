package com.LeetCode;

public class _1295_统计位数为偶数的数字 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {555,901,482,1771};
		System.out.println(findNumbers(nums));
	}
	public static int findNumbers(int[] nums) {
        int count=0;
        for(int a:nums) {
        	if(a>=1 && a<10) {
        		
        	}else if(a>=10 && a<100) {
        		count=count+1;
        	}else if(a>=100 && a<1000) {
        		
        	}else if(a>=1000 && a<10000) {
        		count=count+1;
        	}else if(a>=10000 && a<100000) {
        		
        	}else if(a>=100000 && a<1000000) {
        		count=count+1;
        	}
        }
		
		return count;
    }
}
