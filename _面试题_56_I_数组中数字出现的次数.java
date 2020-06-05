package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/28 17:48
 */
public class _面试题_56_I_数组中数字出现的次数 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        int[] res = new _面试题_56_I_数组中数字出现的次数().singleNumbers(nums);
        System.out.println(res[0]+" "+res[1]);
    }
    public int[] singleNumbers(int[] nums) {
        int[] res = new int[2];

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = temp ^ nums[i];
        }
        int mask = 1;

        //mask = k & (-k) 这种方法也可以得到mask，具体原因百度 哈哈哈哈哈
        while((temp & mask) == 0) {
            mask <<= 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & mask) == 0){
                res[0] = res[0]^nums[i];
            }else {
                res[1] = res[1] ^ nums[i];
            }
        }

        return res;
    }
}
