package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0051_N皇后 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int li=solveNQueens(8);
		System.out.println(li);
//		for(int i=0;i<li.size();i++)
//		{
//			System.out.println(li.get(i));
//			System.out.println(i);
//		}
	}

	/*
	 * 
	 * 默认所有位置都是‘.’
	 * 从第一个位置开始放皇后
	 * 如果合法进行下一个位置的检测
	 * 如果不合法backtrack
	 * 
	 */
	public static int solveNQueens(int n) {
		List<List<String>> reasult = new ArrayList();
		char[][] qipan = new char[n][n];
		for(int i=0;i<qipan.length;i++)
		{
			for(int j=0;j<qipan[0].length;j++)
			{
				qipan[i][j]='.';
			}
		}
		
		backtrack(qipan,0,reasult);
		
		return reasult.size();
    }
	
	public static void backtrack(char[][] qipan,int i,List<List<String>> reasult)
	{
		if(i == qipan.length)
		{
			reasult.add(builder(qipan));
			//这里输出一个合法的情况，但是现在还不太会写，等下再写
		}
		
		for(int j=0;j<qipan.length;j++)
		{
			if(validate(qipan,j,i))
			{
				qipan[j][i]='Q';
				backtrack(qipan,i+1,reasult);
				qipan[j][i]='.';
			}
		}
	}
	
	//验证是否合法
	private static boolean validate(char[][] broad, int i, int colIndex) {
	    for (int x = 0; x < broad.length; x++) {
	        for (int y = 0; y < colIndex; y++) {
	            /**
	                * x ==i 是水平方向
	                * x + colIndex = i +y  是斜左上角
	                * x + y = colIndex + i 是斜左下角
	                */
	            if (broad[x][y] == 'Q' && (x == i || x + colIndex == i + y || x + y == i + colIndex)) {
	                return false;
	            }
	        }
	    }
	    return true;
	}

	//这个就是所有都合法了，要添加一个情况
	public static List<String> builder(char[][] qipan) {
		List<String> li = new ArrayList<String>();
		for(int i=0;i<qipan.length;i++)
		{
			String str = new String(qipan[i]);
			li.add(str);
		}
		return li;
	}
}
