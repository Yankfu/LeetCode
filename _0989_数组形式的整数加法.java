package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0989_数组形式的整数加法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> li = new ArrayList<>();
        int i = A.length-1;
        int carryIn = 0;
        while(i>=0 && K==0) {
        	int aVal = A[i];
        	i--;
        	int bVal = K%10;
        	K = K / 10;
        	int sum = aVal+bVal+carryIn;
        }
        return li;
    }
}
