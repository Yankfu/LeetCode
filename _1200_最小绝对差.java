package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1200_最小绝对差 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList li = new ArrayList();
        int best=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]-arr[i-1]<best) {
        		best=arr[i]-arr[i-1];
        	}
        }
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]-arr[i-1]==best) {
        		ArrayList list = new ArrayList();
        		list.add(arr[i-1]);
        		list.add(arr[i]);
        		li.add(list);
        	}
        }
		return li;
    }
}
