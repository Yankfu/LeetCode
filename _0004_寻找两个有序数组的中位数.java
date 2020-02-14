package com.LeetCode;

public class _0004_寻找两个有序数组的中位数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {2};
		int[] b= {1,3,4,5};
		System.out.println(findMedianSortedArrays(a,b));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length=nums1.length+nums2.length;
		int zhong = length/2;
		int num1Point=0;
		int num2Point=0;
		int point = 0;
		if(nums1.length==0 || (nums2.length!=0&&nums1[nums1.length-1]<=nums2[0])){
			if(length%2 == 0){ //有两个中位数
				if(nums1.length<zhong){
					return (nums2[(zhong-nums1.length)]+nums2[(zhong-nums1.length)-1])/2.0;
				}else if(nums1.length==zhong){
					return (nums1[nums1.length-1]+nums2[0])/2.0;
				}else{
					return (nums1[zhong]+nums1[zhong-1])/2.0;
				}
			}else{
				if(nums1.length<=zhong){
					return nums2[(zhong-nums1.length)]/1.0;
				}else{
					return nums1[zhong]/1.0;
				}
			}
		}else if(nums2.length == 0 || (nums1.length!=0&&nums1[0]>nums2[nums2.length-1])){
			if(length%2 == 0){ //有两个中位数
				if(nums2.length<zhong){
					return (nums1[(zhong-nums2.length)]+nums1[(zhong-nums2.length)-1])/2.0;
				}else if(nums2.length==zhong){
					return (nums2[nums2.length-1]+nums1[0])/2.0;
				}else{
					return (nums2[zhong]+nums2[zhong-1])/2.0;
				}
			}else{
				if(nums2.length<=zhong){
					return nums1[(zhong-nums2.length)]/1.0;
				}else{
					return nums2[zhong]/1.0;
				}
			}
		}else{
			if(length%2 == 0){ //有两个中位数
				while(point<length/2-1){
					if(nums1[num1Point]>=nums2[num2Point]){
						num2Point++;
						point++;
					}else if(nums1[num1Point]<nums2[num2Point]){
						num1Point++;
						point++;
					}
				}
				if(nums1[num1Point]<nums2[num2Point] && num1Point+1<nums1.length){
					return nums2[num2Point]>nums1[num1Point+1]?(nums1[num1Point]+nums1[num1Point+1])/2.0:(nums1[num1Point]+nums2[num2Point])/2.0;
				}else if(nums1[num1Point]>nums2[num2Point]&& num2Point+1<nums2.length){
					return nums1[num1Point]>nums2[num2Point+1]?(nums2[num2Point]+nums2[num2Point+1])/2.0:(nums2[num2Point]+nums1[num1Point])/2.0;
				}else {
					return (nums2[num2Point]+nums1[num1Point])/2.0;
				}
			}else{
				while(point<length/2-1){
					if(nums1[num1Point]>=nums2[num2Point]){
						num2Point++;
						point++;
					}else if(nums1[num1Point]<nums2[num2Point]){
						num1Point++;
						point++;
					}
				}
				return nums1[num1Point]>nums2[num2Point]?nums1[num1Point]/1.0:nums2[num2Point]/1.0;
			}
		}
	}
}
