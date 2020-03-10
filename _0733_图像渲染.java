package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/10 下午10:37
 * @Version 1.0
 */
public class _0733_图像渲染 {
	public static void main(String[] args) {
		int[][] image = {
				{1,1,1},
				{1,1,0},
				{1,0,1}
		};
		int sr = 1;
		int sc = 1;
		int newColor = 2;
		int[][] res = floodFill(image,sr,sc,newColor);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int color = image[sr][sc];
		if (color != newColor) {
			dfs(image,sr,sc,newColor,color);
		}
		return image;
	}
	public static void dfs(int[][] images,int sr,int sc,int newColor,int color){
		if (images[sr][sc] == color) {
			images[sr][sc] = newColor;
			if (sr>=1) dfs(images,sr-1,sc,newColor,color);
			if (sc>=1) dfs(images,sr,sc-1,newColor,color);
			if (sr<images.length-1) dfs(images,sr+1,sc,newColor,color);
			if (sc<images[0].length-1) dfs(images,sr,sc+1,newColor,color);
		}
	}
}
