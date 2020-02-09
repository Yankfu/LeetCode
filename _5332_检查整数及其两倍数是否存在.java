package com.LeetCode;

import java.util.Arrays;

public class _5332_检查整数及其两倍数是否存在 {
    public static void main(String[] args) {
        int[] arr = {0,0};
        System.out.print(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int temp;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<0){
                temp = i-1;
                while(temp>=0){
                    if(arr[temp]==arr[i]*2){
                        return true;
                    }else if(arr[temp]<arr[i]*2){
                        break;
                    }
                    temp--;
                }
            }else if(arr[i]>=0){
                temp = i+1;
                while(temp<arr.length){
                    if(arr[temp]==arr[i]*2){
                        return true;
                    }else if(arr[temp]>arr[i]*2){
                        break;
                    }
                    temp++;
                }
            }
        }
        return false;
    }
}
