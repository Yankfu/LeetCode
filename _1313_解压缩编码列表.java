package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/3/3 下午9:52
 * @Version 1.0
 */
public class _1313_解压缩编码列表 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int[] res = decompressRLElist(nums);
		for (int a : res) {
			System.out.print(a + "  ");
		}
	}

	//	public static int[] decompressRLElist(int[] nums) {
//		List<Integer> li = new ArrayList<>();
//		for (int i = 0; i < nums.length; i = i+2) {
//			for (int j = 0; j < nums[i]; j++) {
//				li.add(nums[i+1]);
//			}
//		}
//		int[] res = new int[li.size()];
//		for (int i = 0; i < li.size(); i++) {
//			res[i] = li.get(i);
//		}
//		return res;
//	}
	public static int[] decompressRLElist(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			count += nums[i];
		}
		int[] res = new int[count];
		count = 0;
		for (int i = 0; i < nums.length; i = i+2) {
			int a = nums[i];
			while(a>0){
				a--;
				res[count++] = nums[i+1];
			}
		}
		return res;
	}
}
