package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/29 上午11:12
 * @Version 1.0
 */
public class _0205_同构字符串 {
	public static void main(String[] args) {
		String s = "ab";
		String t = "aa";
		System.out.println(isIsomorphic(s,t));
	}
	public static boolean isIsomorphic(String s, String t) {
		char[] chars = s.toCharArray();
		char[] chart = t.toCharArray();
		Map<Character, Character> mapa = new HashMap<>();
		Map<Character, Character> mapb = new HashMap<>();
		for (int i = 0; i < chars.length; i++) {
			if(mapa.containsKey(chars[i]) && mapa.get(chars[i])==chart[i]){
				continue;
			}else if(!mapa.containsKey(chars[i])){
				mapa.put(chars[i],chart[i]);
			}else {
				return false;
			}
			if(mapb.containsKey(chart[i]) && mapb.get(chart[i])==chars[i]){
				continue;
			}else if(!mapb.containsKey(chart[i])){
				mapb.put(chart[i],chars[i]);
			}else {
				return false;
			}
		}
		return true;
	}
}
