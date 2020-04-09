package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,3,2]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [0,1,0,1,0,1,99]
 * 输出: 99
 *
 * 有限自动机
 *
 * @USER: Yankfu
 * @DATE: 2020/4/9 18:09
 */
public class _0137_只出现一次的数字II {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }
    //确定最后一位是不是1
    public static int singleNumber(int[] nums) {
        int res = 0;
        int[] temp = new int[32];
        for (int i = 0; i < 32; i++) {
            int count = 0;
            boolean allZero = true;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & 1) == 1){
                    count++;
                    allZero = false;
                }
                nums[j] = nums[j] >>> 1;
            }
            if (allZero) break;
            temp[i] = count % 3;
        }
        for (int i = 31; i >= 0; i--) {
            res = res << 1;
            res = (res | temp[i]);
        }
        return res;
    }
}
