package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/1 10:20
 */
public class _0001_两数之和 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if (map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
