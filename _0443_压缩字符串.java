package com.LeetCode;

import java.util.ArrayList;

public class _0443_压缩字符串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = {'a','a','b','b','c','c','c'};
		int temp=compress(chars);
		System.out.println(temp);
		for(int i=0;i<temp;i++) {
			System.out.print(chars[i]+" ");
		}
	}

	/*
	 * 双指针 一个起始位置，一个长度 当长度不等于起始位置就进行计算 然后起始位置=长度，长度++，重复上述操作
	 * 
	 */
	public static int compress(char[] chars) {
		int reasult = 0;
		int Fuck = 1;
		int i = 0;
		ArrayList<Character> li = new ArrayList<Character>();
		while (i < chars.length && Fuck < chars.length) {
			if (chars[i] == chars[Fuck]) {
				Fuck++;
				continue;
			} else if (chars[i] != chars[Fuck]) {
				//System.out.println("i: "+i+" Fuck: "+Fuck);
				int temp = Fuck - i;
				if (temp == 1) {
					li.add(chars[i]);
					reasult++;
				} else if (temp < 10 && temp > 1) {
					reasult += 2;
					li.add(chars[i]);
					for(char a:Integer.toString(temp).toCharArray()) {
						li.add(a);
					}
				} else if (temp < 100 && temp > 9) {
					reasult += 3;
					li.add(chars[i]);
					for(char a:Integer.toString(temp).toCharArray()) {
						li.add(a);
					}
				} else {
					reasult += 4;
					li.add(chars[i]);
					for(char a:Integer.toString(temp).toCharArray()) {
						li.add(a);
					}
				}
				i = Fuck;
				Fuck++;
			}
		}
		if (i == chars.length - 1) {
			reasult++;
			li.add(chars[i]);
			System.out.println("???      1 ");
		} else if (i < chars.length - 1) {
			int temp = Fuck - i;
			if (temp == 1) {
				li.add(chars[i]);
				System.out.println("???      2 ");
				reasult++;
			} else if (temp < 10 && temp > 1) {
				reasult += 2;
				li.add(chars[i]);
				for(char a:Integer.toString(temp).toCharArray()) {
					li.add(a);
				}
			} else if (temp < 100 && temp > 9) {
				reasult += 3;
				li.add(chars[i]);
				for(char a:Integer.toString(temp).toCharArray()) {
					li.add(a);
				}
			} else {
				reasult += 4;
				li.add(chars[i]);
				for(char a:Integer.toString(temp).toCharArray()) {
					li.add(a);
				}
			}
		}
		i=0;
		while(i<li.size()){
			chars[i]=li.get(i);
			i++;
		}
		return reasult;
	}
}
