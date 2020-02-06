package com.LeetCode;

import java.util.Arrays;

public class _0075_颜色分类 {
    public static void main(String[] args) {
        int[] nums = {1};
        sortColors(nums);
        for(int a:nums){
            System.out.print(a+" ");
        }
    }
    //排序
    //slow指向未排序的第一个，之前的认为已经有序
    /*
    增量设计
     */
    public static void sortColors(int[] nums) {
        int point = 1;
        int slow = point;
        int temp;
        while(point < nums.length){
            while(slow>0 && nums[slow] < nums[slow-1]){
                temp = nums[slow];
                nums[slow] = nums[slow-1];
                nums[slow-1] = temp;
                slow--;
//                for(int a:nums){
//                    System.out.print(a+" ");
//                }
//                System.out.println("slow "+slow+"point "+point);
            }
            point++;
            slow = point;
        }
    }
}
