package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/11 15:51
 */
public class _1437_是否所有1都至少相隔k个元素 {
    public boolean kLengthApart(int[] nums, int k) {

        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                slow = i;
                break;
            }
        }
        int fast = slow+1;
        int count = 0;
        while (fast<nums.length){
            if (nums[fast] == 1){
                if (count<k){
                    return false;
                }else {
                    slow = fast;
                    fast = slow+1;
                }
                count = 0;
            }else if (nums[fast] == 0){
                count++;
                fast++;
            }
        }
        return true;
    }
}
