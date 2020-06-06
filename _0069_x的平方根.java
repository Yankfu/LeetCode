package com.LeetCode;

public class _0069_x的平方根 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(15));
	}
	public static int mySqrt(int x) {
		if(x==Integer.MAX_VALUE) {
			x=x-1;
		}
        double xn = x;
        int a=(int)xn;
        int b=Integer.MAX_VALUE;
        while(a!=b) {
        	xn=xn-(xn*xn-x)/(2*xn);
        	b=a;
        	a=(int)xn;
        }
		return a;
    }
}
