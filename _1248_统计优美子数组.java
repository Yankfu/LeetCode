package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 *
 * 给你一个整数数组 nums 和一个整数 k。
 *
 * 如果某个 连续 子数组中恰好有 k 个奇数数字，我们就认为这个子数组是「优美子数组」。
 *
 * 请返回这个数组中「优美子数组」的数目。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,1,2,1,1], k = 3
 * 输出：2
 * 解释：包含 3 个奇数的子数组是 [1,1,2,1] 和 [1,2,1,1] 。
 * 示例 2：
 *
 * 输入：nums = [2,4,6], k = 1
 * 输出：0
 * 解释：数列中不包含任何奇数，所以不存在优美子数组。
 * 示例 3：
 *
 * 输入：nums = [2,2,2,1,2,2,1,2,2,2], k = 2
 * 输出：16
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 50000
 * 1 <= nums[i] <= 10^5
 * 1 <= k <= nums.length
 *
 * @USER: Yankfu
 * @DATE: 2020/4/21 6:11
 */
public class _1248_统计优美子数组 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int k = 1;
        System.out.println(new _1248_统计优美子数组().numberOfSubarrays(nums,k));
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0;
        int[] arr = new int[nums.length+2];
        int index = 0;
        arr[index++] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 1){
                arr[index++] = i;
            }
        }
        arr[index--] = nums.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 1; i + k < index + 2; i ++) {
            //System.out.println(arr[i] +" "+ arr[i - 1]+" "+arr[i + k] +" "+ arr[i + k - 1]);
            res += (arr[i] - arr[i - 1]) * (arr[i + k] - arr[i + k - 1]);
        }
        return res;
    }
}
