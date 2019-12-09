package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0905_按奇偶排序数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> ji = new ArrayList<Integer>();
        ArrayList<Integer> ou = new ArrayList<Integer>();
		for(int i=0;i<A.length;i++)
        {
        	if((A[i]&1)==0)
        	{
        		ou.add(A[i]);
        	}
        	else
        		ji.add(A[i]);
        }
		ou.addAll(ji);
		int[] d = new int[ou.size()];
		for(int i = 0;i<ou.size();i++){
		    d[i] = ou.get(i);
		}

		return d;
    }
}
