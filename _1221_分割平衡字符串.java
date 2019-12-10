package com.LeetCode;

public class _1221_分割平衡字符串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(balancedStringSplit("RLRRLLRLRL"));
	}

	public static int balancedStringSplit(String s) {
        int r=0;
        int reasult=0;
        for(char ch:s.toCharArray()) {
        	if(ch=='L') {
        		r++;
        	}else if(ch=='R'){
        		r--;
        	}
        	if(r==0) {
        		reasult++;
        	}
        }
		return reasult;
    }
}
