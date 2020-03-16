package com.LeetCode;

import java.util.Arrays;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/16 上午8:59
 * @Version 1.0
 */
public class _面试题_01_06_字符串压缩 {
	public static void main(String[] args) {
		String S = "aaaaaabc";
		System.out.println(compressString(S));
	}
	public static String compressString(String S) {
		if (S.length() == 1) return S;
		StringBuilder sb = new StringBuilder();
		char[] ch = S.toCharArray();
		int slow = 0;
		for (int i = 1; i < ch.length; i++) {
			if (i == ch.length-1){
				if (ch[i] == ch[slow]) {
					sb.append(ch[slow]);
					sb.append(Integer.toString(i-slow+1));
					break;
				}else if (ch[i] != ch[slow]) {
					sb.append(ch[slow]);
					sb.append(Integer.toString(i-slow));
					sb.append(ch[i]);
					sb.append(Integer.toString(1));
					break;
				}
			}else if (i < ch.length-1 && ch[i] == ch[slow]) continue;
			else {
				sb.append(ch[slow]);
				sb.append(Integer.toString(i-slow));
				slow = i;
			}
		}
		return ch.length>sb.length()?sb.toString():S;
	}
}
