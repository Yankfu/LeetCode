package com.LeetCode;

public class _1309_解码字母到整数映射 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(freqAlphabets("9"));
		//System.out.println((char)('1'+48));
	}
	public static String freqAlphabets(String s) {
        char[] ch=s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=ch.length-1;i>=0;i--) {
        	if(ch[i]!='#') {
        		sb.append((char)(ch[i]+48));
        	}else {
        		int a=0;
        		a=(ch[i-1]-48)+(ch[i-2]-48)*10;
        		sb.append((char)(a+48+48));
        		i=i-2;
        	}
        }
		return sb.reverse().toString();
    }
}
