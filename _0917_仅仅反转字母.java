package com.LeetCode;

public class _0917_仅仅反转字母 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "a-bC-dEf-ghIj";
		System.out.println(reverseOnlyLetters(S));
	}
	public static String reverseOnlyLetters(String S) {
		char[] ch = S.toCharArray();
		int low = 0;
		int high = ch.length-1;
		char temp;
		while(low<high) {
			if(ch[low]<'A' || ch[low]>'z' || (ch[low]>'Z' && ch[low]<'a')) { //如果不是字母
				low++;
				continue;
			}
			if(ch[high]<'A' || ch[high]>'z' || (ch[high]>'Z' && ch[high]<'a')) { //如果不是字母
				high--;
				continue;
			}
			temp = ch[low];
			ch[low] = ch[high];
			ch[high] = temp;
			low++;
			high--;
		}
		String str = "";
		for(char a:ch) {
			str=str+a;
		}
		return str;
    }
}
