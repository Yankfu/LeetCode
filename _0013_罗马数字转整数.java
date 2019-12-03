package com.LeetCode;

public class _0013_罗马数字转整数 {

	/*
	 * 字符 数值 I 1 V 5 X 10 L 50 C 100 D 500 M 1000
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "III";
		System.out.println(romanToInt(s));
	}

	public static int romanToInt(String s) {
		char[] a = s.toCharArray();
		int result = 0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] == 'I' && a[i + 1] != 'V' && a[i + 1] != 'X') {
				result += 1;
			} else if (a[i] == 'I' && (a[i + 1] == 'V' || a[i + 1] == 'X')) {
				result += -1;
			} else if (a[i] == 'X' && (a[i + 1] == 'L' || a[i + 1] == 'C')) {
				result += -10;
			} else if (a[i] == 'X' && a[i + 1] != 'L' && a[i + 1] != 'C') {
				result += 10;
			} else if (a[i] == 'C' && (a[i + 1] == 'M' || a[i + 1] == 'D')) {
				result += -100;
			} else if (a[i] == 'C' && a[i + 1] != 'M' && a[i + 1] != 'D') {
				result += 100;
			} else if (a[i] == 'M') {
				result += 1000;
			} else if (a[i] == 'D') {
				result += 500;
			} else if (a[i] == 'L') {
				result += 50;
			} else if (a[i] == 'V') {
				result += 5;
			}
		}
		switch(a[a.length-1])
        {
            case 'I':result += 1; break;
            case 'V':result += 5; break;
            case 'X':result += 10; break;
            case 'L':result += 50; break;
            case 'C':result += 100; break;
            case 'D':result += 500; break;
            case 'M':result += 1000; break;
        }
		return result;
	}
}
