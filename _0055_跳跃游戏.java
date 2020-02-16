package com.LeetCode;

public class _0055_跳跃游戏 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    //核心思想：
    /*
    只要能跳到最后的节点就是好节点
    能跳到好节点的一定是能跳到最后的
    只需要判断第一个能不能跳到好节点
     */
    public static boolean canJump(int[] nums) {
        int lastGood = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if((i+nums[i])>=lastGood){
                lastGood = i;
            }
        }
        return lastGood == 0;
    }
}
