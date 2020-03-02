package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/20 下午7:39
 * @Version 1.0
 */
public class _1239_串联字符串的最大长度 {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		String[] str ={
				"cha","r","act","ers"
		};
		for(String s:str){
			arr.add(s);
		}
		System.out.println(maxLength(arr));
	}
	static int res = 0;
	public static int maxLength(List<String> arr) {
		boolean[] used = new boolean[26];
		backTrack(arr,0,used,0);
		return res;
	}
	public static void backTrack(List<String> arr,int deep,boolean[] used,int pre){
		if(deep == arr.size()){
			res = pre;
			return;
		}else{
			for(int i = 0;i<arr.size();i++){
				char[] ch = arr.get(i).toCharArray();
				boolean[] next = used.clone();
				for(char a:ch){
					if(!next[(int)(a-'a')]){
						next[(int)(a-'a')] = true;
					}else{
						//如果用过了就比较上一个的长度，然后赋值给res
						if(pre > res){
							res = pre;
						}
						break;
					}
				}
				backTrack(arr,deep+1,next,count(next));
			}
		}
	}
	public static int count(boolean[] used){
		int cou = 0;
		for(boolean a:used){
			if(a){
				cou++;
			}
		}
		return cou;
	}
}
