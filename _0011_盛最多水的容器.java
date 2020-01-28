package com.LeetCode;

public class _0011_盛最多水的容器 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
	public static int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length-1;
        int a;
        int b;
        while(left<=right) {
        	b = right - left;
        	a = height[left]>height[right]?height[right--]:height[left++];
        	res = (a*b)>res?(a*b):res;
        }
        return res;
    }
}
