package com.LeetCode;

public class _0405_数字转换为十六进制数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toHex(-1));
	}
	public static String toHex(int num) {
		if(num==0) {
			return "0";
		}
        char[] ch = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		StringBuilder sb = new StringBuilder();
        while(num!=0) {
        	int end = num&15;
        	num = num>>>4;
        	sb.append(ch[end]);
        }
		return sb.reverse().toString();
    }
}
