package com.LeetCode;

public class _0383_赎金信 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canConstruct("aa","aab"));
	}
	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] num = new int[26];
		for(char a:magazine.toCharArray()) {
			num[(a-'a')]++;
		}
//		for(int a:num) {
//			System.out.print(a+" ");
//		}
		for(char a:ransomNote.toCharArray()) {
			if(--num[(a-'a')]<0) {
				return false;
			}
		}
        return true;
    }
}
