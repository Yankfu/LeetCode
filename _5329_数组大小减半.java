package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _5329_数组大小减半 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(minSetSize(arr));
	}
	public static int minSetSize(int[] arr) {
        Map<Integer,Integer> map  = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int a:arr) {
        	set.add(a);
        }
        int[] temp = new int[set.size()];
        int i=0;
        for(int a:set) {
        	temp[i] = a;
        	i++;
        }
        for(int a:temp) {
        	map.put(a, 0);
        }
        for(int a:arr) {
        	map.put(a,((map.get(a))+1));
        }
        int[] temp1 = new int[temp.length];
        for(i=0;i<temp.length;i++) {
        	temp1[i] = map.get(temp[i]);
        }
        Arrays.sort(temp1);
        int count=0;
        i = 0;
//        for(int a:temp1) {
//        	System.out.print(a+" ");
//        }
        while(count<arr.length/2) {
        	count = count +temp1[temp1.length-i-1];
        	i++;
        }
		return i;
    }
}
