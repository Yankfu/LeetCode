package com.LeetCode;

import java.util.Arrays;

public class _1296_划分数组为连续数字的集合 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,1,2,3,4,3,4,5,9,10,11};
		int k=3;
		System.out.println(isPossibleDivide(nums,k));
	}
	public static boolean isPossibleDivide(int[] nums, int k) {
		if(nums.length%k!=0) {
			return false;
		}
		
		Arrays.sort(nums);
		int i=nums.length/k;
		while(i>0) {
			int[] test=new int[k];
			int temp=0;
			for(int j=0;j<nums.length;j++) {
				//System.out.print(nums[j]+"  ");
				if(temp==0) {
					if(nums[j]!=-1) {
						test[temp]=nums[j];
						nums[j]=-1;
						temp++;
					}
				}else if(temp>0 && temp<k) {
					if(nums[j]!=-1 && nums[j]!=test[temp-1]) {
						test[temp]=nums[j];
						nums[j]=-1;
						temp++;
					}
				}else if(temp==k) {
					break;
				}
				//System.out.println(a+"  "+b+"  "+c+"  "+i);
			}
//			for(int a:test) {
//				System.out.print(a+"  ");
//			}
//			System.out.println();
			for(int m=1;m<test.length;m++) {
				if(test[m]!=test[m-1]+1) {
					return false;
				}
				else {
					
				}
			}
			i--;
		}
		
		return true;
    }
}
