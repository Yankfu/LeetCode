package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0989_数组形式的整数加法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1};
		int k = 99999;
		System.out.println(addToArrayForm(A,k));
	}
	public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> li = new ArrayList<>();
        int i=A.length-1;
        int carryIn = 0;
        while(i>=0 || K!=0) {
        	int aVal;
        	if(i>=0) {
        		aVal = A[i];
            	i--;
        	}else {
        		aVal = 0;
        	}
        	
        	
        	int bVal = K%10;
        	K=K/10;
        	
        	int sum = aVal + bVal + carryIn;
        	//System.out.println(sum);
        	carryIn = sum / 10;
        	li.add(sum%10);
        }
        if (carryIn == 1) {
			li.add(1);
		}
        List<Integer> li1 = new ArrayList<>();
        for(int j=li.size()-1;j>=0;j--) {
        	li1.add(li.get(j));
        }
        return li1;
    }
}
