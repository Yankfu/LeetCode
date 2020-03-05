package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/5 下午9:59
 * @Version 1.0
 */
public class _0168_Excel表列名称 {
	public static void main(String[] args) {
		System.out.print(convertToTitle(701));
	}
	public static String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		int temp;
		while(n > 0){
			int mod = (n-1) % 26;
			sb.append((char)('A'+mod));
			n = (n-1) / 26;
		}
		return sb.reverse().toString();
	}
}
