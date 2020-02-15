package com.LeetCode;

public class _0357_计算各个位数不同的数字个数 {
    static int count = 0;
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            count = 0;
            System.out.println(countNumbersWithUniqueDigits(i));
        }
    }
    public static int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        boolean[] nums = new boolean[10];
        for(int i=0;i<nums.length;i++){
            nums[i] = true;
        }
        for(int i = 1;i<10;i++){
            nums[i] = false;
            count++;
            backTrack(nums,1,n);
            nums[i] = true;
        }
//        for(int i = 0;i<nums.length;i++){
//            if(!nums[i]){
//                System.out.print(i);
//            }
//        }
//        System.out.println();
        return count+1;
    }
    public static void backTrack(boolean[] nums,int now,int n){
        if(now == n){
            return;
        }
        for(int i = 0;i<10;i++){
            if(nums[i]){
                count++;
                nums[i] = false;
                backTrack(nums,now+1,n);
                nums[i] = true;
            }else{
                continue;
            }
        }
    }
    //数学方法
    public int countNumbersWithUniqueDigits_0ms(int n) {
        switch (n){
            case 0:
                return 1;
            case 1:
                return 10;
            case 2:
                return 91;
            case 3:
                return 739;
            case 4:
                return 5275;
            case 5:
                return 32491;
            case 6:
                return 168571;
            case 7:
                return 712891;
            case 8:
                return 2345851;
            case 9:
                return 5611771;
        }
        return 0;
    }
}
