package com.LeetCode;

import java.util.Random;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/26 上午10:29
 * @Version 1.0
 */
public class _0528_按权重随机选择 {
	public static void main(String[] args) {
		int[] w = {1,3};
		Solution528 so = new Solution528(w);
	}
	static class Solution528 {
		int[] w;
		public Solution528(int[] w) {
			int sum = 0;
			this.w = new int[w.length];
			for (int i = 0; i < w.length; i++) {
				sum = sum + w[i];
				this.w[i] = sum;
			}
		}

		public int pickIndex() {
			Random ran = new Random();
			int target = ran.nextInt(w[w.length-1])+1;
			int left = 0;
			int right = w.length-1;
			int mid;
			while(left<right){
				mid = left+((right-left)>>1);
				if(w[mid] == target){
					return mid;
				}else if(w[mid] < target){
					left = mid+1;
				}else{
					right = mid;
				}
			}
			return left;
		}
	}
}
