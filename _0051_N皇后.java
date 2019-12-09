package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0051_N皇后{

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
	 * Ĭ������λ�ö��ǡ�.��
	 * �ӵ�һ��λ�ÿ�ʼ�Żʺ�
	 * ����Ϸ�������һ��λ�õļ��
	 * ������Ϸ�backtrack
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
			//�������һ���Ϸ���������������ڻ���̫��д��������д
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
	
	//��֤�Ƿ�Ϸ�
	private static boolean validate(char[][] broad, int i, int colIndex) {
	    for (int x = 0; x < broad.length; x++) {
	        for (int y = 0; y < colIndex; y++) {
	            /**
	                * x ==i ��ˮƽ����
	                * x + colIndex = i +y  ��б���Ͻ�
	                * x + y = colIndex + i ��б���½�
	                */
	            if (broad[x][y] == 'Q' && (x == i || x + colIndex == i + y || x + y == i + colIndex)) {
	                return false;
	            }
	        }
	    }
	    return true;
	}

	//����������ж��Ϸ��ˣ�Ҫ���һ�����
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
