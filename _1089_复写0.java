package com.LeetCode;

public class _1089_复写0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,0,0,0,0,0};
		duplicateZeros(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void duplicateZeros(int[] arr) {
		if(arr.length <= 1) {
			
		}
		else {
			int[] temp = new int[arr.length];
	        int i=0;
	        int j=0;
			while(i<arr.length && j<arr.length ) {
				if(arr[i] != 0) {
					temp[j] = arr[i];
					j++;
					i++;
				}else {
					temp[j] = arr[i];
					j++;
					if(j<arr.length) {
						temp[j] = arr[i];
					}
					i++;
					j++;
				}
			}
			for(int k=0;k<arr.length;k++) {
				arr[k]=temp[k];
			}
		}
    }
}
