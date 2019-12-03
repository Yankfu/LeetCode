package com.LeetCode;

import java.util.ArrayList;

public class _0006_Z×ÖÐÎ±ä»» {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "LEETCODEISHIRING";
		int numRows = 3;
		System.out.println(convert(s, numRows));
	}

	public static String convert(String s, int numRows) {
		ArrayList<char[]> list = new ArrayList<char[]>();
		char[] a = s.toCharArray();
		int i = 0;
		for (int j = 0; j < ((a.length / numRows) + 1); j++) {
			char[] num = new char[numRows];
			for (int k = 0; k < numRows; k++) {
				if (i < a.length) {
					num[k] = a[i];
					i++;
				}

			}
			list.add(num);
		}

		for (int j = 0; j < ((a.length / numRows) + 1); j++) {
			System.out.println(list.get(j));
		}

		return "abc";
	}
}
