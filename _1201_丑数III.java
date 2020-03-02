package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/29 下午5:19
 * @Version 1.0
 */
public class _1201_丑数III {
	public static void main(String[] args) {
		int n = 1000000000, a = 2, b = 217983653, c = 336916467;
		System.out.println(nthUglyNumber(n,a,b,c));
	}
	public static int nthUglyNumber(int n, int a, int b, int c) {
		int[] res = new int[n+1];
		int a1 = 0,b1 = 0,c1 = 0;
		res[0] = 1;
		for (int i = 1; i <= n; i++) {
			int min = Math.min(res[a1]*a,Math.min(res[b1]*b,res[c1]*c));
			if(min == res[a1]*a){
				a1++;
			}
			if(min == res[b1]*b){
				b1++;
			}
			if(min == res[c1]*c){
				c1++;
			}
			res[i] = min;
		}
		return res[n];
	}
}
