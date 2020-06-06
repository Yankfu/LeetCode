package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/6 21:36
 */
public class _0128_最长连续序列 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        int max = 0;

        for(int i:set){
            if(!set.contains(i-1)){
                int currentNum = i;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                max = currentStreak>max?currentStreak:max;
            }
        }
        return max;
    }
}
