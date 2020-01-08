package com.LeetCode;

public class _1189_气球的最大数量 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxNumberOfBalloons("balloon"));
	}
	public static int maxNumberOfBalloons(String text) {
		if(text.length()<7) {
			return 0;
		}
        int res=Integer.MAX_VALUE;
        int[] temp = new int[5];
        char[] ch = text.toCharArray();
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]=='b') {
        		temp[0]++;
        	}else if(ch[i]=='a') {
        		temp[1]++;
        	}else if(ch[i]=='l') {
        		temp[2]++;
        	}else if(ch[i]=='o') {
        		temp[3]++;
        	}else if(ch[i]=='n') {
        		temp[4]++;
        	}else {
        		continue;
        	}
        }
        temp[2]=temp[2]/2;
        temp[3]=temp[3]/2;
        for(int a:temp) {
        	if(a<res) {
        		res=a;
        	}
        }
		return res;
    }
}
