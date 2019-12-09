package com.LeetCode;

public class _1128_等价多米诺骨牌对数量{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] dominoes= {{1,2},{2,1},{1,2},{3,5},{5,3}};
		System.out.println(numEquivDominoPairs(dominoes));
	}

	public static int numEquivDominoPairs(int[][] dominoes) {
		int n=0;
		int temp = 0;
		for(int i=0;i<dominoes.length;i++)
		{
			if(dominoes[i][0]>dominoes[i][1])
			{
				temp=dominoes[i][0];
				dominoes[i][0]=dominoes[i][1];
				dominoes[i][1]=temp;
			}
		}
		
		for(int i=0;i<dominoes.length;i++)
		{
			for(int j=i;j<dominoes.length;j++)
			{
				if(dominoes[i][0]>dominoes[j][0])
				{
					temp=dominoes[i][0];
					dominoes[i][0]=dominoes[j][0];
					dominoes[j][0]=temp;
				}
			}
		}
		
		for(int i=0;i<dominoes.length;i++)
		{
			for(int j=i+1;j<dominoes.length;j++)
			{
                if(dominoes[i][0]+1<dominoes[j][0])//������
                {
                    break;
                }
                else if(dominoes[i][0]==dominoes[j][0])
				{
					if(dominoes[i][1]==dominoes[j][1])
					{
						n++;
//						dominoes[j][0]=-1;
//						dominoes[j][1]=-1;
					}
				}
			}
		}
		
		return n;
    }
}
