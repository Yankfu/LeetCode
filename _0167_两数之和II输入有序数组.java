package com.LeetCode;

public class _0167_两数之和II输入有序数组 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int[] res = twoSum(numbers,9);
        System.out.println(res[0]+" "+res[1]);
    }
    public static int[] twoSum(int[] numbers, int target) {

        int[] res = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            //System.out.println(numbers[left]+" "+numbers[right]);
            if(numbers[left]+numbers[right] > target){
                right--;
            }else if(numbers[left]+numbers[right] < target){
                left++;
            }else if(numbers[left]+numbers[right] == target){
                res[0]=left+1;
                res[1]=right+1;
                break;
            }
        }
        return res;
    }
}
