package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/22 下午9:23
 * @Version 1.0
 */
public class _0091_解码方法 {
	public static void main(String[] args) {
		String s = "0";
		System.out.println(numDecodings(s));
	}
	//从最后一个开始填表
	public static int numDecodings(String s) {
		int res = 0;
		char[] temp = s.toCharArray();
		int pre = 26;
		int preCount1 = 1;
		int preCount2 = 0;
		for (int i = temp.length-1; i >= 0; i--) {
			if((temp[i]-'0') == 0){
				res = 0;
				preCount2 = preCount1;
				preCount1 = res;
			} else if ((temp[i]-'0')*10+pre <= 26) {
				res = preCount1+preCount2;
				preCount2 = preCount1;
				preCount1 = res;
			} else{
				res = preCount1;
				preCount2 = preCount1;
				preCount1 = res;
			}
			pre = temp[i]-'0';
		}
		return res;
	}
}
