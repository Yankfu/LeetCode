package com.LeetCode;

public class _0485_最大连续1的个数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
        int temp=0;
        int best=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                temp++;
                if(temp>best){
                    best=temp;
                }
            }else if(nums[i]==0){
                temp=0;
            }
        }
        return best;
    }
}
