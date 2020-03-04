package com.LeetCode;

import java.util.*;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/4 下午11:30
 * @Version 1.0
 */
public class _0970_强整数 {
	public static void main(String[] args) {
		List<Integer> res = powerfulIntegers(2,3,10);
		for (Integer a:res){
			System.out.print(a+" ");
		}
	}
	public static List<Integer> powerfulIntegers(int x, int y, int bound) {
		List<Integer> res = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		int xMax = x == 1 ? 0 : (int)(Math.log(bound-1) / Math.log(x));
		int yMax = y == 1 ? 0 : (int)(Math.log(bound-1) / Math.log(y));
		for (int i = 0; i <= xMax; i++) {
			for (int j = 0; j <= yMax; j++) {
				if(Math.pow(x,i)+ Math.pow(y,j) <= bound){
					set.add((int)(Math.pow(x,i) + Math.pow(y,j)));
				}else{
					break;
				}
			}
		}
		res.addAll(set);
		return res;
	}
}
