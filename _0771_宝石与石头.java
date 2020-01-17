package com.LeetCode;

public class _0771_宝石与石头 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J = "sfdgasdf";
		String S = "";
		System.out.println(numJewelsInStones(J,S));
	}
	public static int numJewelsInStones(String J, String S) {
        char[] a = J.toCharArray();
        char[] b = S.toCharArray();
        int res = 0;
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<b.length;j++) {
        		if(a[i]==b[j]) {
        			res++;
        		}
        	}
        }
		return res;
    }
}
