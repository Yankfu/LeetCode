package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/12 上午10:01
 * @Version 1.0
 */
public class _1071_字符串的最大公因子 {
	public static void main(String[] args) {
		String str1 = "ABCABC";
		String str2 = "ABC";
		System.out.println(gcdOfStrings(str1,str2));
	}
	public static String gcdOfStrings(String str1, String str2) {
		String temp1 = str1+str2;
		String temp2 = str2+str1;
		if (!temp1.equals(temp2)) return "";
		return str1.substring(0,help(str1.length(),str2.length()));
	}
	public static int help(int a,int b){
		return b == 0? a: help(b, a % b);
	}
}
