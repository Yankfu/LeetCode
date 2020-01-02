package com.LeetCode;

import java.util.ArrayList;

public class _1078_Bigram分词 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "alice is a good girl she is a good student";
		String first = "a";
		String second = "good";
		String[] str = findOcurrences(text,first,second);
		for(String st : str) {
			System.out.println(st);
		}
	}
	public static String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> al = new ArrayList<String>();
        String[] words = text.split(" ");
        for(int i = 0;i < words.length - 2;i++){
            if(words[i].equals(first) && words[i + 1].equals(second)){
                al.add(words[i + 2]);
            }
        }
        return (String[])al.toArray(new String[al.size()]);
    }
}
