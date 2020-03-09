package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/9 下午9:14
 * @Version 1.0
 */
public class _面试题_08_09_括号 {
	public static void main(String[] args) {
		List<String> res = generateParenthesis(2);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}
	static List<String> li  = new ArrayList<>();
	public static List<String> generateParenthesis(int n) {
		help(0,"",n*2,0,0);
		return li;
	}
	public static void help(int n,String str,int total,int left,int right){
		if (n == total){
			li.add(str);
			return;
		}else {
			if (left<(total/2) && right<(total/2)){
				help(n+1,str+"(",total,left+1,right);
				if (left>right) {
					help(n+1,str+")",total,left,right+1);
				}
			} else if (left<(total/2)) {
				help(n+1,str+")",total,left+1,right);
			} else if (right<(total/2)) {
				help(n+1,str+")",total,left,right+1);
			}

		}
	}
}
