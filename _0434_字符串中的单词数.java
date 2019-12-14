package com.LeetCode;

public class _0434_字符串中的单词数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSegments("aaaa aa aaa aa   "));
	}

	public static int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }
}
