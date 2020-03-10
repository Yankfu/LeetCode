package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/4 下午11:25
 * @Version 1.0
 */
public class _0953_验证外星语词典 {
	public static void main(String[] args) {
		String[] words = {"hello","leetcode"};
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		System.out.println(isAlienSorted(words,order));
	}

	public static boolean isAlienSorted(String[] words, String order) {
		//初始化字典序，到时候需要按照这个排序走。
		Map<Character,Integer> map = new HashMap<>();
		char[] ch = order.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i],i);
		}

		char[][] temp = new char[words.length][];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = words[i].toCharArray();
		}
		int[][] res = new int[words.length][];
		int big = 0;
		for (int i = 0; i < temp.length; i++) {
			res[i] = new int[temp[i].length];
			if (temp[i].length>big){
				big = temp[i].length;
			}
			for (int j = 0; j < temp[i].length; j++) {
				res[i][j] = map.get(temp[i][j]);
			}
		}

		for (int i = 1; i < res.length; i++) {
			if (!help(res[i],res[i-1])){
				return false;
			}
		}

		return true;
	}

	public static boolean help(int[] a, int[] b){
		int len = Math.min(a.length, b.length);
		for (int i = 0; i < len; i++) {
			//找第一个不同的
			if (a[i] == b[i]){

			}else {
				if (a[i]<b[i]) {
					return false;
				} else if (a[i]>b[i]) {
					return true;
				}
			}
		}
		if (a.length<b.length) return false;
		return true;
	}
}
