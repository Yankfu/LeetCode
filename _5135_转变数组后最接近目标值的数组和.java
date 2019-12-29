package com.LeetCode;

import java.util.Arrays;

public class _5135_转变数组后最接近目标值的数组和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5};
		int target = 10;
		System.out.println(findBestValue(arr,target));
	}
	public static int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        if(arr[0]*arr.length>target) {
        	int temp=target/arr.length;
        	int res1=temp*arr.length-target;
        	int res2=(temp+1)*arr.length-target;
        	if(res1<res2) {
        		return temp;
        	}else {
        		return temp+1;
        	}
        }else if(arr[arr.length-1]*arr.length<target) {
        	return arr[arr.length-1];
        }
        int count=0;
    	int totalCount=arr[0];
    	
        for(int i=1;i<arr.length;i++) {
        	int now = arr.length-i-1;//现在还剩下的元素的大小
        	int coun = 0;
        	if(arr[i]==arr[i-1]) {
        		count++;
        		continue;
        	}
        	totalCount=totalCount+count*arr[i-1];
        	for(int j=arr[i-1];j<arr[i];j++) {
//        		if(target) {
//        			
//        		}
        	}
        	
        	
        }
        
		return 0;
    }
}
