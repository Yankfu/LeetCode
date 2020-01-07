package com.LeetCode;

public class _0389_找不同 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTheDifference("","a"));
	}
	public static char findTheDifference(String s, String t) {
		if(s.length()==0){
            return t.charAt(0);
        }
        char[] temp = (s+t).toCharArray();
        char res=temp[0];
        for(int i=1;i<temp.length;i++) {
        	res=(char) (res^temp[i]);
        }
		return res;
    }
}
