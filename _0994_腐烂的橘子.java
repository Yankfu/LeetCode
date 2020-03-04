package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/4 下午10:03
 * @Version 1.0
 */
public class _0994_腐烂的橘子 {
	public static void main(String[] args) {
		int[][] grid = {
				{2,1,1},
				{1,1,0},
				{0,1,1}
		};
		System.out.print(orangesRotting(grid));
	}
	public static int orangesRotting(int[][] grid) {
		int res = 0;
		List<Integer> bad = new ArrayList<>();
		List<Integer> bad2 = new ArrayList<>();
		List<Integer> good = new ArrayList<>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 2){
					bad.add(i);
					bad.add(j);
				}else if(grid[i][j] == 1){
					good.add(i);
					good.add(j);
				}
			}
		}
		int[][] temp = {
				{-1,0},
				{0,1},
				{1,0},
				{0,-1}
		};
		while (true){
			if(bad.size() == 0 && good.size()!=0){
				return -1;
			}else if (good.size() == 0)
			{
				break;
			}
			for (int i = 0; i < bad.size(); i = i + 2) {
				int x = bad.get(i);
				int y = bad.get(i+1);
				for (int j = 0; j < 4; j++) {
					x = x+temp[j][0];
					y = y+temp[j][1];

					for (int k = 0; k < good.size(); k = k+2) {
						if (good.get(k) == x && good.get(k+1) == y){
							bad2.add(good.get(k));
							good.remove(k);
							bad2.add(good.get(k));
							good.remove(k);
							k = k-2;
						}
					}

					x = x-temp[j][0];
					y = y-temp[j][1];
				}
			}
			bad.clear();
			bad.addAll(bad2);
			bad2.clear();
			res++;
		}
//		boolean flag = true;
//		while (true){
//			for (int i = 0; i < good.size(); i = i+2) {
//				int x = good.get(i);
//				int y = good.get(i+1);
//				for (int j = 0; j < 4; j++) {
//					x = x+temp[j][0];
//					y = y+temp[j][1];
//
//					for (int k = 0; k < bad.size(); k = k+2) {
//						if (bad.get(k) == x && bad.get(k+1) == y){
//							good.remove(k);
//							good.remove(k+1);
//							k = k-2;
//							bad2.add(k);
//							bad2.add(k+1);
//						}
//					}
//					if (flag){
//						return -1;
//					}
//
//					x = x-temp[j][0];
//					y = y-temp[j][1];
//				}
//			}
//			res++;
//			if (good.size() == 0 || bad.size() == 0)
//				break;
//		}
		return res;
	}
}
