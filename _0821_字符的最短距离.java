package com.LeetCode;

public class _0821_字符的最短距离 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S="e";
		int[] B=shortestToChar(S,'e');
		for(int k=0;k<B.length;k++)
		{
			System.out.print(B[k]+"  ");
		}
	}

	public static int[] shortestToChar(String S, char C) {
		char[] nes=S.toCharArray();
		if(nes.length==1)
		{
			int[] D= {0};
			return D;
		}
		int[] result=new int[nes.length];
		int[] temp=new int[nes.length];
		for(int i=0;i<result.length;i++)
		{
			result[i]=20000;
		}
		for(int i=0;i<nes.length;i++)
		{
			if(nes[i]==C)
			{
				temp[i]=0;//��temp���鸳ֵ
				int j=i;
				while(j>0)
				{
					temp[j-1]=temp[j]+1;
					j--;
				}
				j=i;
				while(j<temp.length-1)
				{
					temp[j+1]=temp[j]+1;
					j++;
				}
				
				for(int k=0;k<result.length;k++)
				{
					if(temp[k]<result[k])
					{
						result[k]=temp[k];
					}
				}
				
			}
		}
		
		return result;
    }
}
