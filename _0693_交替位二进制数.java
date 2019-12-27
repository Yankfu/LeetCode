package com.LeetCode;

public class _0693_交替位二进制数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasAlternatingBits(11));
	}
	public static boolean hasAlternatingBits(int n) {
        int pre=2;
		while(n!=0) {
			if(pre==2) {
				if((n&1)==1) {
	        		pre=1;
	        		n=n>>1;
	        	}else if((n&1)==0) {
	        		pre=0;
	        		n=n>>1;
	        	}
			}
			else if(pre==1) {
        		if((n&1)==1) {
        			return false;
        		}else{
        			pre=0;
        			n=n>>1;
        		}
        	}else if(pre==0) {
        		if((n&1)==0) {
        			return false;
        		}else {
        			pre=1;
        			n=n>>1;
        		}
        	}
        }
		return true;
    }
}
