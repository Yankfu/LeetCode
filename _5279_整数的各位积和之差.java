package com.LeetCode;

public class _5279_整数的各位积和之差 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subtractProductAndSum(99999));
	}

	public static int subtractProductAndSum(int n) {
		if(n<10) {
			return 0;
		}
		int re1=1;
		int re2=0;
		int temp=0;
		while( (n/10) > 0 ) {
			temp=n%10;
			re1=re1*temp;
			re2=re2+temp;
			n=n/10;
		}
		
        return re1*n-re2-n;
    }
}
