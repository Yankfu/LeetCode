package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/14 8:18
 */
public class _1471_数组中的k个最强值 {
    //数组中的 k 个最强值
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int mid = arr[(arr.length-1)/2];
        int[] res = new int[k];
        int left = 0;
        int right = arr.length-1;
        int index = 0;
        while (k>0){
            int temp = 0;
            if (Math.abs(arr[right]-mid) >= Math.abs(arr[left]-mid)){
                temp = arr[right--];
            } else if (Math.abs(arr[right]-mid) < Math.abs(arr[left]-mid)) {
                temp = arr[left++];
            }
            res[index++] = temp;
            k--;
        }
        return res;
    }
}
