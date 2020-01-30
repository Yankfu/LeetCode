package com.LeetCode;

public class _0042_接雨水 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
	}
	
	public static int trap(int[] height) {
        int res = 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int temp = Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++) {
        	if(height[i]>temp) {
        		temp = height[i];
        	}
        	left[i] = temp;
        }
        temp = Integer.MIN_VALUE;
        for(int i=height.length-1;i>=0;i--) {
        	if(height[i]>temp) {
        		temp = height[i];
        	}
        	right[i] = temp;
        }
        for(int i = 0;i<height.length;i++) {
        	//System.out.println(left[i]>right[i]?(right[i]-height[i]):(left[i]-height[i]));
        	temp = left[i]>right[i]?(right[i]-height[i]):(left[i]-height[i]);
        	res = res + temp;
        }
		return res;
    }

//	public static int trap(int[] height) {
//		int res = 0;
//		int big = Integer.MIN_VALUE;
//		for (int i = 0; i < height.length; i++) {
//			if (height[i] > big) {
//				big = height[i];
//			}
//		}
//		int low;
//		int fast;
//		while (big > 0) {
////			for (int i = 0; i < height.length; i++) {
////				System.out.print(height[i] + " ");
////			}
////			System.out.println();
//			low = 0;
//			fast = 0;
//			while (low < height.length - 1) {
//				if (height[low] == 0) {
//				} else if (height[low] > 0 && height[low + 1] > 0) {
//					height[low]--;
//				} else if (height[low] > 0 && height[low + 1] == 0) {
//					height[low]--;
//					fast = low + 1;
//					while (fast < height.length && height[fast] == 0) {
//						fast++;
//					}
//					// System.out.println(fast - low - 1+" "+fast+" "+low);
//					if (fast == height.length) {
//						low++;
//						continue;
//					}
//					res = res + (fast - low - 1);
//				}
//				low++;
//			}
//			if (height[height.length - 1] > 0) {
//				height[height.length - 1]--;
//			}
//			big--;
//		}
//		return res;
//	}
}
