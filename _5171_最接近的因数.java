package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/23 上午10:59
 * @Version 1.0
 */
public class _5171_最接近的因数 {
	public static void main(String[] args) {
		int[] res = closestDivisors(123);
		System.out.println(res[0]+"  "+res[1]);
	}
	public static int[] closestDivisors(int num) {
		int[] res = new int[2];
		int[] res2 = new int[2];
		double sqrt = Math.sqrt((num+1));
		for(int i = (int)sqrt;i>0;i--){
			if((double)(num+1)/i == (int)(num+1)/i){
				res[0] = (num+1)/i;
				res[1] = i;
				break;
			}
		}
		//System.out.println(res[0]+"  "+res[1]);
		double sqrt2 = Math.sqrt((num+2));
		for(int i = (int)sqrt2;i>0;i--){
			if((double)(num+2)/i == (int)(num+2)/i){
				res2[0] = (num+2)/i;
				res2[1] = i;
				break;
			}
		}
		//System.out.println(res2[0]+"  "+res2[1]);
		return ((res[0]-res[1])>res2[0]-res2[1]?res2:res);
	}
}
