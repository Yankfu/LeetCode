package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/13 21:34
 */
public class _0324_摆动排序II {
    public void wiggleSort(int[] nums) {
        if (nums == null || nums.length <= 1){
            return;
        }
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int j = 0;
        int k = temp.length-1;
        if (temp.length%2 == 0){
            j = temp.length/2-1;
        }else {
            j = temp.length/2;
        }
        boolean flag = true;
        for (int i = 0; i < temp.length; i++) {
            if (flag){
                nums[i] = temp[j--];
                flag = false;
            }else {
                nums[i] = temp[k--];
                flag = true;
            }
        }
    }
}
