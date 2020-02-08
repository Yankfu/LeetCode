package com.LeetCode;

import java.util.Arrays;

public class _0532_数组中的K_diff数对 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 5, 4};
        System.out.print(findPairs(nums,0));
    }
    public static int findPairs(int[] nums, int k) {
        if(nums.length<1){
            return 0;
        }
        int res = 0;
        Arrays.sort(nums);
        int slow = 0;
        int fast;
        while(slow < nums.length){
            if(slow>0 && nums[slow]==nums[slow-1]){
                slow++;
                continue;
            }
            fast = slow+1;
            while(fast < nums.length){
                //System.out.println(nums[slow]+" "+nums[fast]);
                if(nums[fast] - nums[slow] == k){
                    res++;
                    break;
                }else if(nums[fast] - nums[slow] < k){
                    fast++;
                }else if(nums[fast] - nums[slow] > k){
                    break;
                }
            }
            slow++;
        }
        return res;
    }
}
