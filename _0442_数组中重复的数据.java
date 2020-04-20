package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/20 11:29
 */
public class _0442_数组中重复的数据 {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            nums[index] = nums[index]*-1;
            if (nums[index]>0){
                list.add(index+1);
            }
        }
        return list;
    }
}
