package com.LeetCode;

public class _0520_检测大写字母 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(detectCapitalUse(" "));
	}
	public static boolean detectCapitalUse(String word) {
        if(word.length()==0) {
        	return true;
        }
		char[] ch = word.toCharArray();
        if(ch[0]<='z' && ch[0]>='a') {
        	for(int i=1;i<ch.length;i++) {
        		if(ch[i]>='A' && ch[i]<='Z') {
        			return false;
        		}
        	}
        }
        if(ch.length==1 && ((ch[0]<='Z' && ch[0]>='A') || (ch[0]<='z' && ch[0]>='a'))) {
        	return true;
        }else if(ch.length==1) {
        	return false;
        }
        if((ch[0]<='Z' && ch[0]>='A') && (ch[1]<='z' && ch[1]>='a')) {
        	for(int i=2;i<ch.length;i++) {
        		if(ch[i]>='A' && ch[i]<='Z') {
        			return false;
        		}
        	}
        }
        if((ch[0]<='Z' && ch[0]>='A') && (ch[1]<='Z' && ch[1]>='A')) {
        	for(int i=2;i<ch.length;i++) {
        		if(ch[i]>='a' && ch[i]<='z') {
        			return false;
        		}
        	}
        }
        return true;
    }
}
