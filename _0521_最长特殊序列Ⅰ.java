package com.LeetCode;

public class _0521_最长特殊序列Ⅰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findLUSlength(String a, String b) {
        if(a.equals(b))
            return -1;
        return a.length() > b.length() ? a.length() : b.length();
    }
}
