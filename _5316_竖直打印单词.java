package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _5316_竖直打印单词 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "TO BE OR NOT TO BE";
		List<String> li = new ArrayList<>();
		li = printVertically(s);
		for(String sb:li) {
			System.out.println(sb);
		}
	}

	public static List<String> printVertically(String s) {
		String[] temp = s.split(" ");
		char[][] ch = new char[temp.length][];
		int big = Integer.MIN_VALUE;
		for (int i = 0; i < temp.length; i++) {
			ch[i] = temp[i].toCharArray();
			if (ch[i].length > big) {
				big = ch[i].length;
			}
		}
		List<String> li = new ArrayList<>();
		for (int i = 0; i < big; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < ch.length; j++) {
				if (i >= ch[j].length) {
					sb.append(' ');
				} else {
					sb.append(ch[j][i]);
				}
			}
			//System.out.println(trimEnd(sb.toString().toCharArray())+"    !!!!!!!");
			li.add(trimEnd(sb.toString().toCharArray()));
		}
//		for(int i=0;i<big;i++) {
//			for(int j=0;j<ch.length;j++) {
//				if(i>=ch[j].length) {
//					System.out.print(" ");
//				}else {
//					System.out.print(ch[j][i]);
//				}
//			}
//			System.out.println();
//		}
		return li;
	}
	public static String trimEnd(char[] value) {
        int len = value.length;
        int st = 0;
        char[] val = value;
        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        return ((st > 0) || (len < value.length)) ? new String(val).substring(st, len) : new String(val);
    }
}
