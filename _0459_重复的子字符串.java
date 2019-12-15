package com.LeetCode;

public class _0459_重复的子字符串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
	    return str.substring(1, str.length() - 1).contains(s);
    }
}  
