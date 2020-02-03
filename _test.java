package com.LeetCode;
import java.awt.*;
import java.awt.event.InputEvent;
public class _test {
	public static void main(String[] args){
		int[] nums = {3,0,1,8,7,2,5,4,9,6};
		quick(nums);
		for(int i:nums) {
			System.out.print(i+" ");
		}
	}
	/*
	 * 比较两个指针指向的数的大小
	 * 如果low<high high--
	 * 如果low>high 交换位置然后low++
	 */
	public static void quick(int[] nums) {
		int high = nums.length-1;
		int low = 0;
		while(low < high) {
			if(nums[low]<=nums[high]) {
				high--;
			}else if(nums[low]>nums[high]) {
				int temp = nums[low];
				nums[low] = nums[high];
				nums[high] = temp;
				low++;
			}
			for(int i:nums) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}