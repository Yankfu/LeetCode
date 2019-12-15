package com.LeetCode;

public class _0541_反转字符串II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		int k=2;
		System.out.println(reverseStr(s,k));
	}
	public static String reverseStr(String s, int k) {
		if(k>=s.length()) {
			StringBuilder sb = new StringBuilder();
			StringBuffer temp=new StringBuffer(s);
			sb.append(temp.reverse());
			return sb.toString();
		}
        int i=0;
        int j=k-1;
        int flag=0;
		StringBuilder sb = new StringBuilder();
		while(i<s.length()-k) {
			if(flag==0) {
				StringBuffer temp=new StringBuffer(s.substring(i, j+1));
				sb.append(temp.reverse());
				flag=1;
				i=i+k;
				j=j+k;
			}
			else if(flag==1) {
				StringBuffer temp=new StringBuffer(s.substring(i, j+1));
				sb.append(temp);
				flag=0;
				i=i+k;
				j=j+k;
			}
		}
		if(flag==1) {
			StringBuffer temp=new StringBuffer(s.substring(i));
			sb.append(temp);
		}else if(flag==0) {
			StringBuffer temp=new StringBuffer(s.substring(i));
			sb.append(temp.reverse());
		}
		return sb.toString();
    }
}
