package com.LeetCode;

public class _0080_删除排序数组中的重复项II {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(removeDuplicates(nums));
        for(int a:nums){
            System.out.print(a+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int slow = 0; // 这个是重写数据的
        int fast = 0; // 这个是计算每个数字有多少个的
        int res = 0;
        int pre = nums[0];
        int count=0;
        while(fast<nums.length){
            if(nums[fast] == pre){
                fast++;
                count++;
                continue;
            }
            //System.out.println(pre+" "+count);
            if(count == 1){
                nums[slow++] = pre;
                res++;
            }
            else if(count >= 2){
                nums[slow++] = pre;
                nums[slow++] = pre;
                res = res + 2;
            }
            pre = nums[fast];
            count = 0;
        }
        if(count == 1){
            nums[slow++] = pre;
            res++;
        }
        else if(count >= 2){
            nums[slow++] = pre;
            nums[slow++] = pre;
            res = res + 2;
        }
        return res;
    }
}
