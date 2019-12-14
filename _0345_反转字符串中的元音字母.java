package com.LeetCode;

public class _0345_反转字符串中的元音字母 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels(""));
	}

	public static String reverseVowels(String s) {
		char[] ch = s.toCharArray();
		int low = 0;
		int high = ch.length - 1;
		int flagLow = 0;
		int flagHigh = 0;
		char[] list = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		while (low < high) {
			System.out.println("low: " + ch[low] + " " + low + "   high: " + ch[high] + " " + high);
			for (char a : list) {
				if (ch[low] == a) {
					flagLow = 1;
					break;
				}
			}
			for (char a : list) {
				if (ch[high] == a) {
					flagHigh = 1;
					break;
				}
			}
			if (flagLow == 1 && flagHigh == 1) {
				char temp = ch[low];
				ch[low] = ch[high];
				ch[high] = temp;
				flagLow = 0;
				flagHigh = 0;
				low++;
				high--;
			} else if (flagLow == 0 && flagHigh == 1) {
				low++;
			} else if (flagLow == 1 && flagHigh == 0) {
				high--;
			} else if (flagLow == 0 && flagHigh == 0) {
				high--;
				low++;
			}

		}
		return new String(ch);
	}
}
