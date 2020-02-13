package com.LeetCode;
import java.awt.*;
import java.awt.event.InputEvent;
public class _0000_test {
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6};
		FUCK(nums);
		for(int a:nums){
			System.out.print(a+" ");
		}
	}
	public static void FUCK(int[] nums){
		nums[0] = 6;
		FUCK2(nums);
	}
	public static void FUCK2(int[] nums){
		if(nums[0] != 6){
			nums[2] = 6;
		}else{
			nums[1] = 6;
		}
	}
}