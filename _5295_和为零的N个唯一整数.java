package com.LeetCode;

public class _5295_和为零的N个唯一整数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] res=sumZero(1000);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+"  ");
			if(i%100==0) {
				System.out.println();
			}
		}
	}

	public static int[] sumZero(int n) {
        int[] res = new int[n];
        int temp=-(n/2);
        for(int i=0;i<n;i++) {
        	if(temp==0) {
        		temp++;
        	}
        	res[i]=temp++;
        }
        if(res[0]!=-res[n-1]) {
        	res[n-1]=0;
        }
		return res;
    }
}
