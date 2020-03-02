package com.LeetCode;
import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Arrays;

public class _0000_test {
	public static void main(String[] args){
		int[] nums = {3,2,3,1,2,4,5,5,6};
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}