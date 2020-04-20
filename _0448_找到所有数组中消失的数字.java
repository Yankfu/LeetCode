package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/20 11:20
 */
public class _0448_找到所有数组中消失的数字 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(new _0448_找到所有数组中消失的数字().findDisappearedNumbers(nums));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            nums[index] = Math.abs(nums[index])*-1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
}
