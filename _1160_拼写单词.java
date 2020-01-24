package com.LeetCode;

public class _1160_拼写单词 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"hello","world","leetcode"};
		String chars = "welldonehoneyr";
		System.out.println(countCharacters(words,chars));
	}
	
	public static int countCharacters(String[] words, String chars) {
        char[] temp = chars.toCharArray();
		int res = 0;
        int[] num = new int[26];
        for(int i=0;i<temp.length;i++) {
			num[temp[i]-'a']++;
		}
        for(int i=0;i<words.length;i++) {
        	int[] nums = num.clone();
        	char[] ch = words[i].toCharArray();
        	boolean flag = true;
        	for(char a:ch) {
        		if(nums[a-'a']==0) {
        			flag = false;
        		}else {
        			nums[a-'a']--;
        		}
        	}
        	System.out.println(words[i]+"  "+res);
        	if(flag) {
        		res = res + ch.length;
        	}
        		
        }
        return res;
    }
}
