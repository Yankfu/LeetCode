package com.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1331_数组序号转换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {400,100,200,300};
		int[] a = arrayRankTransform(arr);
		for(int b:a) {
			System.out.print(b+" ");
		}
	}
	public static int[] arrayRankTransform(int[] arr) {
        int[] temp=arr.clone();
        Arrays.sort(temp);
        Map<Integer,Integer> ma = new HashMap<>();
        int index=1;
        for(int i=0;i<temp.length;i++) {
        	if(i==0) {
        		ma.put(temp[i], index);
        		index++;
        	}else if(i>0 && temp[i]!=temp[i-1]) {
        		ma.put(temp[i], index);
        		index++;
        	}
        }
        for(int i=0;i<arr.length;i++) {
        	arr[i]=ma.get(arr[i]);
        }
		return arr;
    }
}
