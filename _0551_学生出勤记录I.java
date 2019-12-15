package com.LeetCode;

public class _0551_学生出勤记录I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkRecord(""));
	}
	public static boolean checkRecord(String s) {
		boolean flag1=false;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='A' && !flag1) {
				flag1=true;
			}else if(ch[i]=='A' && flag1) {
				return false;
			}
			if(ch[i]=='L' && i+2<=ch.length-1) {
				if(ch[i+1]=='L' && ch[i+2]=='L') {
					return false;
				}
			}
		}
		return true;
    }
}
