package com.LeetCode;

public class _1009_十进制整数的反码 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bitwiseComplement(5));
	}
	public static int bitwiseComplement(int N) {
		int temp=0;
		while(N!=0) {
			if((N&1)==0) {
				temp=temp|1;
			}else {
				
			}
			N=N>>>1;
			temp=temp<<1;
		}
		int res=0;
		while(temp!=0) {
			if((temp&1)==1) {
				res=res|1;
			}else {
				
			}
			temp=temp>>>1;
			res=res<<1;
		}
        return (res);
    }
}
