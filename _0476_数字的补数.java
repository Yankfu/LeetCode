package com.LeetCode;

public class _0476_数字的补数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findComplement(5));
	}
	public static int findComplement(int num) {
		int tmp = num;
        int num2 = 1;
        while(tmp>0){
            num2<<=1;
            tmp>>=1;
        }
        num2-=1;
        return num^num2;
    }
}
