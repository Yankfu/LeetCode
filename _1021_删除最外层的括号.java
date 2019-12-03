package com.LeetCode;

public class _1021_É¾³ı×îÍâ²ãµÄÀ¨ºÅ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S="()()()";
		System.out.println(removeOuterParentheses(S));
	}

	public static String removeOuterParentheses(String S) {
		char[] a = S.toCharArray();
		int[] b = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '(') {
				count++;
				b[i] = count;
			} else if (a[i] == ')') {
				count--;
				b[i] = count;
			}
		}
		count = 0;
		char[] s_pre = new char[a.length];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (b[i] == 1 && a[i] == '(') {
				count++;
				continue;
			} else if (b[i] == 0 && a[i] == ')') {
				count++;
				continue;
			} else {
				s_pre[j] = a[i];
				j++;
			}
		}

		char[] s_pre_pre = new char[s_pre.length - count];
		for (int i = 0; i < s_pre_pre.length; i++) {
			s_pre_pre[i] = s_pre[i];
		}
		StringBuffer str5 = new StringBuffer();
		for (char s : s_pre_pre) {
			str5.append(s);
		}
		return str5.toString();
	}
}
