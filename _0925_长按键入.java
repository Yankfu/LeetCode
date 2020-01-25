package com.LeetCode;

public class _0925_长按键入 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "dfuyalc";
		String typed = "fuuyallc";
		System.out.println(isLongPressedName(name,typed));
	}
	public static boolean isLongPressedName(String name, String typed) {
        if(name.charAt(0)!=typed.charAt(0)) {
        	return false;
        }
		if(name.length()>typed.length()) {
        	return false;
        }
		char[] ch1 = name.toCharArray();
        char[] ch2 = typed.toCharArray();
        int i=0;
        int j=0;
        while(i<ch1.length && j<ch2.length) {
        	System.out.println("ch1: "+ch1[i]+" ch2: "+ch2[j]);
        	if(ch1[i] == ch2[j]) {
        		i++;
        		j++;
        	}
        	else if(ch2[j] != ch1[i]) {
        		if(ch2[j] == ch1[i-1]) {
        			j++;
        		}else {
        			return false;
        		}
        	}
        }
        if(i<ch1.length) {
        	return false;
        }
		return true;
    }
}
