package com.LeetCode;

public class _0861_翻转矩阵后的得分 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A= {{0,0,1,1},{0,1,0,1},{1,1,0,0}};
		System.out.println(matrixScore(A));
	}

	//先把所有行的第一个变成1
	//然后按照0出现的位置进行排序
	public static int matrixScore(int[][] A) {
		int result=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i][0]==1)
			{
				continue;
			}
			else
			{
				for(int j=0;j<A[0].length;j++)
				{
					if(A[i][j]==1)
						A[i][j]=0;
					else if(A[i][j]==0)
						A[i][j]=1;
				}
			}
		}
		int count=0;
		for(int i=1;i<A[0].length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				if(A[j][i]==1)
				{
					count++;
				}
				else if(A[j][i]==0)
				{
					count--;
				}
				if(j==A.length-1)
				{
					if(count>=0)
					{
						count=0;
						continue;
					}
					if(count<0)
					{
						for(int k=0;k<A.length;k++)
						{
							if(A[k][i]==1)
								A[k][i]=0;
							else if(A[k][i]==0)
								A[k][i]=1;
						}
						count=0;
					}
				}
			}
		}
		for(int i=0;i<A.length;i++)
		{
			int k=1;
			for(int j=A[0].length-1;j>=0;j--)
			{
				result=result+A[i][j]*k;
				k=k*2;
				//System.out.println(result);
			}
		}
		return result;
    }
}
