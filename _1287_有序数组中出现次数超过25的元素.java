package com.LeetCode;

public class _1287_有序数组中出现次数超过25的元素 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int findSpecialInteger(int[] arr) {
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==arr[i+arr.length/4]) {
        		return arr[i];
        	}
        }
        return -1;
    }
}
