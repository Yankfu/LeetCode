package com.LeetCode;

public class _0477_汉明距离总和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 14, 2 };
		System.out.println(totalHammingDistance(nums));
	}

	public static int totalHammingDistance(int[] nums) {
		int len = nums.length;
		int reasult = 0;
		int temp = 0;
		int flag = 0;
		for (int i = 0; i < 31; i++) {
			for (int j = 0; j < len; j++) {
				temp = temp + (nums[j] & 1);
				nums[j] = nums[j] >> 1;
				flag = flag + nums[j];
			}
			reasult = reasult + (temp * (len - temp));
			if (flag == 0) {
				break;
			}
			temp = 0;
			flag = 0;
		}
		return reasult;
//        for(int i=0;i<32;i++) {
//        	System.out.print(one[i] + " ");
//        }

//        System.out.println();

	}
}
