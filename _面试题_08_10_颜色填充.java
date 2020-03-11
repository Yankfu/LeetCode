package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/11 上午11:59
 * @Version 1.0
 */
public class _面试题_08_10_颜色填充 {
	public static void main(String[] args) {

	}
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int color = image[sr][sc];
		if (color != newColor) {
			help(image,sr,sc,newColor,color);
		}
		return image;
	}
	public void help(int[][] image,int sr,int sc,int newColor,int color){
		if (image[sr][sc] == color) {
			image[sr][sc] = newColor;
			if (sr>=1) help(image,sr-1,sc,newColor,color);
			if (sc>=1) help(image,sr,sc-1,newColor,color);
			if (sr<image.length-1) help(image,sr+1,sc,newColor,color);
			if (sc<image[0].length-1) help(image,sr,sc+1,newColor,color);
		}
	}
}
