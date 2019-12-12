package com.LeetCode;

public class _0283_移动零 {
	public static int[] nums= {0,1,2,3,0,0,4,5,0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveZeroes(nums);
		for(int a:nums) {
			System.out.print(a+"  ");
		}
	}
	public static void moveZeroes(int[] nums) {
        int j=0;
		int[] temp=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
        	if(nums[i]==0) {
        		continue;
        	}else {
        		temp[j]=nums[i];
        		j++;
        	}
        }
		for(int i=0;i<nums.length;i++) {
			nums[i]=temp[i];
		}
    }
}
