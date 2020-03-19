package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/19 下午9:41
 * @Version 1.0
 */
public class _1370_上升下降字符串 {
	public static void main(String[] args) {

	}
	public static String sortString(String s) {
		StringBuilder sb = new StringBuilder();
		int[] temp = new int[26];
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			temp[(int)(ch[i]-'a')]++;
		}
		int big = Integer.MIN_VALUE;
		for (int i = 0; i < temp.length; i++) {
			if(temp[i]>big){
				big = temp[i];
			}
		}
		boolean flag = true;
		while(big>=0){
			if (flag){
				for (int i = 0; i < temp.length; i++) {
					if(temp[i]>0){
						sb.append((char)(i+'a'));
						temp[i]--;
					}else{
						continue;
					}
				}
				flag = false;
			}else if (!flag) {
				for (int i = temp.length-1; i >= 0; i--) {
					if(temp[i]>0){
						sb.append((char)(i+'a'));
						temp[i]--;
					}else{
						continue;
					}
				}
				flag = true;
			}
			big--;
		}
		return sb.toString();
	}
}
