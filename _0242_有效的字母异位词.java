package com.LeetCode;

import java.util.Arrays;

public class _0242_有效的字母异位词 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public boolean isAnagram(String s, String t) {
	        if (s.length() != t.length()) {
	        return false;
	    }
	    char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
	    Arrays.sort(str1);
	    Arrays.sort(str2);
	    return Arrays.equals(str1, str2);
	    }
}
