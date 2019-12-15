package com.LeetCode;

public class _387_字符串中的第一个唯一字符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("leetcode"));
	}
	public static int firstUniqChar(String s) {
		int[] num = new int[26];
		for(char a:s.toCharArray()) {
			num[(a-'a')]++;
		}
		int best=Integer.MAX_VALUE;
		for(int i=0;i<num.length;i++) {
			if(num[i]==1) {
				char temp=(char) (i+'a');
				//System.out.println("best: "+best+" s.indexOf(temp): "+s.indexOf(temp)+" temp: "+temp);
				if(best>s.indexOf(temp) && s.indexOf(temp)!=-1) {
					best=s.indexOf(temp);
				}
			}
		}
		return best==Integer.MAX_VALUE?-1:best;
    }
}
