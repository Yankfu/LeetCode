package com.LeetCode;

public class _1323_6和9组成的最大数字 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		System.out.println(maximum69Number(num));
	}
	public static int maximum69Number (int num) {
		int[] a=new int[4];
		int i=3;
		while(num!=0) {
			a[i]=num%10;
			num=num/10;
			i--;
		}
		int res=0;
		int flag=0;
		for(i=0;i<a.length;i++) {
			//System.out.print(a[i]+" ");
			if(a[i]==6 && flag==0) {
				res=res*10+9;
				flag=1;
			}else {
				res=res*10+a[i];
			}
		}
		return res;
    }
}
