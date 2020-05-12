package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/12 23:20
 */
public class _1442_形成两个异或相等数组的三元组数目 {
    //形成两个异或相等数组的三元组数目
    public int countTriplets(int[] nums) {
        int res = 0;
        //如果数量小于3个，认为构不成，返回0；
        if(nums.length<2) {
            return res;
        }else if(nums.length==2) { //如果等于三个
            int a = nums[0];
            int b = nums[1];
            if(a == b) {
                return ++res;
            }else {
                return res;
            }
        }
        for(int i=0;i<nums.length-1;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int index = j;
                int a = 0;
                for (int k = i; k < index; k++) {
                    a = (a^nums[k]);
                }
                int b = nums[j];
                while (index > i) {
                    if (a == b){
                        res++;
                    }
                    index--;
                    a = (a^nums[index]);
                    b = (b^nums[index]);
                }
            }
        }
        return res;
    }
}
