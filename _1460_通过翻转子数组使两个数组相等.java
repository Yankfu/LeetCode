package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/7 14:27
 */
public class _1460_通过翻转子数组使两个数组相等 {
    //通过翻转子数组使两个数组相等
    public boolean canBeEqual(int[] target, int[] arr) {
        if (arr.length!=target.length){
            return false;
        }
        int[] temp = new int[1001];
        for (int i = 0; i < target.length; i++) {
            temp[target[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]--;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]!=0){
                return false;
            }
        }
        return true;
    }
}
