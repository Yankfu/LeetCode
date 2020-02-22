package com.LeetCode;

import java.util.Arrays;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/22 下午10:33
 * @Version 1.0
 */
public class _5323_根据数字二进制下1的数目排序 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8};
		int[] res = sortByBits(arr);
		for(int a:res){
			System.out.print(a+" ");
		}
	}
	public static int[] sortByBits(int[] arr) {
		Arrays.sort(arr);
		int[] count = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			count[i] = hammingWeight(arr[i]);
		}
		int[] res = new int[arr.length];
		int point = 0;
		for (int i = 0; i < 33; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(count[j] == i){
					res[point] = arr[j];
					point++;
				}
			}
		}
//		for(int a:arr){
//			System.out.print(a+" ");
//		}
//		System.out.println();
		return res;
	}
	public static int hammingWeight(int n) {
		int count=0;
		for(int i=0;i<32;i++){
			if((n&1)!=0){
				count++;
			}
			n=n>>1;
		}
		return count;
	}
}
