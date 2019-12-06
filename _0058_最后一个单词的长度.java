package com.LeetCode;

public class _0058_最后一个单词的长度 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("Hello world  "));
	}
	
	public static int lengthOfLastWord(String s) {
        int end=s.length()-1;
        while(end>=0 && s.charAt(end)==' ') {
        	end--;
        }
        if(end<0) return 0;
        int start=end;
        while(start >= 0 && s.charAt(start)!=' ') {
        	start--;
        }
        return end-start;
    }
}
