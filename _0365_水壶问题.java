package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/21 上午10:26
 * @Version 1.0
 */
public class _0365_水壶问题 {
	public static void main(String[] args) {

	}
	//裴蜀定理
	public boolean canMeasureWater(int x, int y, int z) {
		if(x+y<z)
			return false;
		if(x==0||y==0)
			return x==z||y==z;
		return z%gcd(x,y)==0;
	}

	public int gcd(int x,int y){
		return y==0?x:gcd(y,x%y);
	}
}
