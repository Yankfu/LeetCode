package com.LeetCode;

public class _0868_二进制间距 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryGap(6));
	}
	public static int binaryGap(int N) {
        int best=0;
        int temp=0;
        int flag=0;
        while(N!=0) {
        	if((N&1)==0 && flag==0) {
        		N=N>>1;
        	}else if((N&1)==1 && flag==0) {
        		temp++;
        		flag=1;
        		N=N>>1;
        	}
        	if((N&1)==1 && flag==1) {
        		
        		if(temp>best) {
        			best=temp;
        			temp=0;
        		}else {
        			temp=0;
        		}
        		temp++;
        		
        		N=N>>1;
        	}
        	else if((N&1)==0 && flag==1) {
        		temp++;
        		N=N>>1;
        	}
        }
        return best;
    }
}
