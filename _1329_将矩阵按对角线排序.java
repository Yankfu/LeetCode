package com.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _1329_将矩阵按对角线排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {
				{3,3,1,1},
				{2,2,1,2},
				{1,1,1,2}
		};
		int[][] res = diagonalSort(mat);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

	/**
	 * 按照对角线 x-y一定遍历到map里然后存到
	 * @param mat
	 * @return
	 */
	public static int[][] diagonalSort(int[][] mat){
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		int[][] res = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				ArrayList<Integer> list = map.getOrDefault(j-i,new ArrayList<>());
				list.add(mat[i][j]);
				map.put(j-i,list);
			}
		}
		//排序
		for (int i = -mat.length+1; i < mat[0].length; i++) {
			Collections.sort(map.get(i));
		}
		//写回
		//从左下角到右上角斜着写回
		int indexX = mat.length-1;
		int indexY = 0;
		for (int i = -mat.length+1; i < mat[0].length; i++) {
			int tempX = indexX;
			int tempY = indexY;
			for (int j = 0; j < map.get(i).size(); j++) {
				res[tempX++][tempY++] =  map.get(i).get(j);
			}
			if (indexX == 0){
				indexY++;
			}else {
				indexX--;
			}
		}
//		for (int a:map.keySet()){
//			System.out.print(map.get(a)+"  key:"+a);
//			System.out.println();
//		}
		return res;
	}
}
