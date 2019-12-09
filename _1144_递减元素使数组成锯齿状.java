package com.LeetCode;

public class _1144_递减元素使数组成锯齿状 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {};
		System.out.println(movesToMakeZigzag(nums));
	}

	/*
	 * �����ˣ�����O(4n)����ʵҲ����O(n)��ʱ�临�Ӷ�
	 * ÿ�����������Ƚ�best��ֵ�������bestС������best��������best���С�
	 */
	public static int movesToMakeZigzag(int[] nums) {
	
		int best=Integer.MAX_VALUE;
		int temp=0;
		int[] num=nums.clone();
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print(num[i]);
//		}
//		System.out.println();
		//��һ�˱Ƚϣ�����ż��λ�õ����ָ���һ���ȣ�����Ⱥ�һ����ͼ�����ͬʱtemp++
		for(int i=0;i<num.length-1;i=i+2)
		{
			while(num[i]>=num[i+1])
			{
				num[i]--;
				temp++;
			}
		}
		for(int i=2;i<num.length;i=i+2)
		{
			while(num[i]>=num[i-1])
			{
				num[i]--;
				temp++;
			}
		}
		if(temp<best)
		{
			best=temp;
			temp=0;
		}
		//��ʼ�Ƚ�����λ�õ�����
		for(int i=1;i<nums.length-1;i=i+2)
		{
			while(nums[i]>=nums[i+1])
			{
				nums[i]--;
				temp++;
			}
		}
		for(int i=1;i<nums.length;i=i+2)
		{
			while(nums[i]>=nums[i-1])
			{
				nums[i]--;
				temp++;
			}
		}
		if(temp<best)
		{
			best=temp;
			temp=0;
		}
		return best;
    }
}
