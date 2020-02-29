package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/29 下午4:51
 * @Version 1.0
 */
public class _0264_丑数II {
	public static void main(String[] args) {
		System.out.println(nthUglyNumber(10));
	}
	public static int nthUglyNumber(int n) {
		int[] res = new int[n];
		int a = 0,b = 0,c = 0;
		res[0] = 1;
		for (int i = 1; i < n; i++) {
			int min = Math.min(res[a]*2,Math.min(res[b]*3,res[c]*5));
			if(min == res[a]*2){
				a++;
			}
			if(min == res[b]*3){
				b++;
			}
			if(min == res[c]*5){
				c++;
			}
			res[i] = min;
		}
		return res[n-1];
	}
}
