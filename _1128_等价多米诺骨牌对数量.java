package com.LeetCode;

public class _1128_等价多米诺骨牌对数量{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] dominoes= {{2,1},{1,2},{1,2},{1,2},{2,1},{1,1},{1,2},{2,2}};
		System.out.println(numEquivDominoPairs(dominoes));
	}

	/*
	 * 把每个骨牌小的点数当成十位数，大的点数当成个位数
	 * 因为骨牌两个面的数字都小于9，所以最大只能是99，我们初始化一个大小为99的整型数组
	 * 然后相当于哈希，遍历之前初始化的数组就可得到答案。
	 */
	public static int numEquivDominoPairs(int[][] dominoes) {
		
		int i=0;
		int reasult=0;
		int[] a = new int[100];
		for(int[] temp:dominoes) {
			if(temp[0]>temp[1]) {
				i=temp[0];
				temp[0]=temp[1];
				temp[1]=i;
			}
			//reasult=reasult+a[temp[0]*10+temp[1]];
			a[temp[0]*10+temp[1]]++;
		}
		
		for(int j=0;j<100;j++) {
			System.out.print(a[j]+" ");
			if(j%10==9) {
				System.out.println(a[j]);
			}
			if(a[j]!=0 && a[j]!=1) {
				reasult=reasult+((((1+(a[j]-1))*(a[j]-1))/2));
			}	
		}
		
		return reasult;
    }
}
