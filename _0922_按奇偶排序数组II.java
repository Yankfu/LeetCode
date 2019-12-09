package com.LeetCode;

public class _0922_按奇偶排序数组II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A= {4,2,5,7};
		int[] B=sortArrayByParityII(A);
		for(int i=0;i<B.length;i++)
		{
			System.out.print(B[i]);
		}
		System.out.println();
	}

	public static int[] sortArrayByParityII(int[] A) {
		int[] C=new int[(A.length)/2];
		int[] D=new int[(A.length)/2];
		int c=0;
		int d=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]%2==0)
			{
				C[c]=A[i];
				c++;
			}
			else if(A[i]%2==1)
			{
				D[d]=A[i];
				d++;
			}
		}
		c=0;
		d=0;
		for(int i=0;i<A.length;i++)
		{
			if(i%2==0)
			{
				A[i]=C[c];
				c++;
			}
			else
			{
				A[i]=D[d];
				d++;
			}
		}
		return A;
    }
}
