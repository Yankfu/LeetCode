package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/25 22:45
 */
public class _0228_汇总区间 {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0){
            return list;
        }
        int index = 0;
        int i;
        for (i = 1; i < nums.length; i++) {
            if (nums[i]-1 == nums[i-1]){
                continue;
            }else {
                StringBuilder stringBuilder = new StringBuilder();
                if (i - index - 1 == 0){
                    stringBuilder.append(nums[i-1]);
                }else {
                    stringBuilder.append(nums[index]).append("->").append(nums[i-1]);
                }
                list.add(stringBuilder.toString());
                index = i;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (i - index - 1 == 0){
            stringBuilder.append(nums[i-1]);
        }else {
            stringBuilder.append(nums[index]).append("->").append(nums[i-1]);
        }
        list.add(stringBuilder.toString());
        return list;
    }
}
