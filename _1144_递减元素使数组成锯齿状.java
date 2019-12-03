package com.LeetCode;

public class _1144_递减元素使数组成锯齿状 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {};
		System.out.println(movesToMakeZigzag(nums));
	}

	/*
	 * 走四趟，就是O(4n)，其实也就是O(n)的时间复杂度
	 * 每两趟走下来比较best的值，如果比best小，更新best，最后输出best就行。
	 */
	public static int movesToMakeZigzag(int[] nums) {
	
		int best=Integer.MAX_VALUE;
		int temp=0;
		int[] num=nums.clone();
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print(num[i]);
//		}
//		System.out.println();
		//第一趟比较，先用偶数位置的数字跟后一个比，如果比后一个大就减减，同时temp++
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
		//开始比较奇数位置的数字
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
