package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0412_FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List<String> fizzBuzz(int n) {
        ArrayList res = new ArrayList();
        for(int i=1;i<=n;i++) {
        	boolean flag1 = (i%3==0);
        	boolean flag2 = (i%5==0);
        	if(flag1 && flag2) {
        		res.add("FizzBuzz");
        	}
        	else if(flag1 && !flag2) {
        		res.add("Fizz");
        	}
        	else if(!flag1 && flag2) {
        		res.add("Buzz");
        	}else {
        		res.add(Integer.toString(i));
        	}
        }
		return res;
    }
}
