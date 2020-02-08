package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class _0457_环形数组循环 {
    public static void main(String[] args) {
        int[] nums={-2,1,-1,-2,-2};
        System.out.print(circularArrayLoop(nums));
    }
    /*
    默认成环
    遇到每个都标记
    因为如果不成环必定有以下两个条件不成立
    1.符号相反
    2.循环为1
    如果碰到这两个条件后不成环的与成环的绝对不想交就可以不用遍历了
     */
    public static boolean circularArrayLoop(int[] nums) {
        //长度为1或0的情况下默认没环
        if(nums.length<2){
            return false;
        }
        //进行遍历
        for(int i=0;i<nums.length;i++){
            //如果遇到0就说明进入了别的不成环（循环为1或符号不同）的序列，检测下一个即可
            if(nums[i]==0){
                continue;
            }
            int slow = i;
            int fast = i;
            int lastSlow;
            int lastFast;
            while(true){
                lastSlow = slow;
                slow = (slow + nums[slow] + 1000*nums.length)%nums.length;
                //如果下一个乘上一个小于0（符号相反）或者遇上不成环的路再或者成一步环
                if(nums[lastSlow] * nums[slow] <0 || nums[slow] == 0 || lastSlow == slow){
                    setZero(nums,i);
                    break;
                }
                lastFast = fast;
                fast = (fast + nums[fast] + 1000*nums.length)%nums.length;
                //如果下一个乘上一个小于0（符号相反）或者遇上不成环的路再或者成一步环
                if(nums[lastFast] * nums[fast] <0 || nums[fast] == 0 || lastFast == fast){
                    setZero(nums,i);
                    break;
                }
                lastFast = fast;
                fast = (fast + nums[fast] + 1000*nums.length)%nums.length;
                //如果下一个乘上一个小于0（符号相反）或者遇上不成环的路再或者成一步环
                if(nums[lastFast] * nums[fast] <0 || nums[fast] == 0 || lastFast == fast){
                    setZero(nums,i);
                    break;
                }
                if(slow == fast){
                    return true;
                }
            }
        }
        return false;
    }
    public static void setZero(int[] nums,int i){
        int j;
        while (true) { // !(nums[j] == 0 || nums[i]*nums[j]<0)
            j = (i + nums[i] + 5000*nums.length) % nums.length;
            if (nums[j] == 0 || nums[i]*nums[j]<0) {
                nums[i] = 0;
                break;
            }
            nums[i] = 0;
            i = j;
        }
    }
}
