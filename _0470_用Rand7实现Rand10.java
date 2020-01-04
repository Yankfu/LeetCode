package com.LeetCode;

import java.util.Random;

public class _0470_用Rand7实现Rand10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 1000; i++) {
			System.out.print(rand10()+"  ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		// System.out.println(rand7());
	}

	public static int rand10() {
		int[][] map = { 
				{ 1, 2, 3, 4, 5, 6, 7, }, 
				{ 8, 9, 10, 11, 12, 13, 14, }, 
				{ 15, 16, 17, 18, 19, 20, 21, },
				{ 22, 23, 24, 25, 26, 27, 28, }, 
				{ 29, 30, 31, 32, 33, 34, 35, }, 
				{ 36, 37, 38, 39, 40, 0, 0, },
				{ 0, 0,0, 0, 0, 0, 0, }, };
		int res = 0;
		int a=rand7();
		int b=rand7();
		res=map[a][b];
		while (res == 0) {
			a=rand7();
			b=rand7();
			res=map[a][b];
		}
		return res%10+1;
	}

	public static int rand7() {
		Random random = new Random();// 以系统当前时间作为随机数生成的种子
		return random.nextInt(7);
	}
}
