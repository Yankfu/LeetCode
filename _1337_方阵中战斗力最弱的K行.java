package com.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1337_方阵中战斗力最弱的K行 {

	private static final int HashMap = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {
				{1,1,0,0,0},
				{1,1,1,1,0},
				{1,0,0,0,0},
				{1,1,0,0,0},
				{1,1,1,1,1}
		};
		int k = 3;
		int[] res = kWeakestRows(mat,k);
		for(int a:res) {
			System.out.print(a+" ");
		}
	}
	public static int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        int[] temp =new int[mat.length];
        for(int i = 0;i<mat.length;i++) {
        	int count = 0;
        	for(int j= 0;j<mat[0].length;j++) {
        		if(mat[i][j] == 1) {
        			count++;
        		}
        	}
        	temp[i] = count;
        }
        int[] arr = temp.clone();
        Arrays.sort(arr);
        for(int i=0;i<k;i++) {
        	for(int j = 0;j<temp.length;j++) {
        		if(temp[j]==arr[i]) {
        			res[i]=j;
        			temp[j]=Integer.MAX_VALUE;
        			break;
        		}
        	}
        }
        return res;
    }
}
