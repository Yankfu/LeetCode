package com.LeetCode;

public class _0371_两整数之和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(0,-1));
	}
	public static int getSum(int a, int b) {
        int res=0;
        boolean flagA = true;
        boolean flagB = true;
        boolean jin = false;
        while(a!=0 || b!=0) {
        	if((a&1)==1) {
        		flagA=true;
        	}else {
        		flagA=false;
        	}
        	if((b&1)==1) {
        		flagB=true;
        	}else {
        		flagB=false;
        	}
        	System.out.println("a的最后一位 "+(a&1)+"  b的最后一位 "+(b&1)+"  flagA "+flagA+"  flagB "+flagB+"  jin "+jin);
        	if(!flagA && !flagB && !jin) {
        		jin=false;
        	}else if((!flagA && !flagB && jin) || (!flagA && flagB && !jin) || (flagA && !flagB && !jin)) {
        		res= (res|1);
        		jin=false;
        	}else if((!flagA && flagB && jin) || (flagA && !flagB && jin) || (flagA && flagB && !jin)) {
        		jin=true;
        	}else if(flagA && flagB && jin) {
        		res= (res|1);
        		jin=true;
        	}
        	a>>>=1;
        	b>>>=1;
        	res<<=1;
        }
        if(jin) {
        	res= (res|1);
        	res<<=1;
        }
        int resReal=0;
        while(res!=0) {
        	resReal=(resReal|(res&1));
        	resReal<<=1;
        	res>>>=1;
        }
        resReal>>>=1;
		return resReal;
    }
}
