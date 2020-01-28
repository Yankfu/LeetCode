package com.LeetCode;

import java.util.Arrays;

public class _5155_将数组进行序号转换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {};
		int[] after = arrayRankTransform(arr);
		for(int a:after) {
			System.out.print(a+" ");
		}
	}
    public static int[] arrayRankTransform(int[] arr) {
    	if(arr.length==0) {
    		return new int[0];
    	}
        int[] res = arr.clone();
        Arrays.sort(arr);
        int[] res1 = new int[res.length];
        int count=0;
        for(int i=0;i<arr.length;i++) {
        	
        	if(i==0) {
        		count++;
        	}else if(i>0 && arr[i]!=arr[i-1]) {
        		count++;
        	}else {
        		
        	}
        	//System.out.println(arr[i]+" "+count);
        	for(int j=0;j<res.length;j++) {
        		if(res[j]==arr[i]) {
        			res1[j]=count;
        		}
        	}
        }
    	return res1;
    }
}
