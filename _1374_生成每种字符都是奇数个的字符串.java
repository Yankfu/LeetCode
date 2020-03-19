package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/19 下午9:46
 * @Version 1.0
 */
public class _1374_生成每种字符都是奇数个的字符串 {
	public static void main(String[] args) {

	}
	public static String generateTheString(int n) {
		StringBuilder sb = new StringBuilder();
		if (n%2==1){
			for (int i = 0; i < n; i++) {
				sb.append('a');
			}
		} else if (n%2 == 0) {
			for (int i = 0; i < n-1; i++) {
				sb.append('a');
			}
			sb.append('b');
		}
		return sb.toString();
	}
}
