package no2010To2020;

public class MaximumDifferenceBetweenIncreasingElements_2016 {

    public static void main (String[] args) {
        int[] nums = {7,1,5,4};
        System.out.println(maximumDifference(nums));
    }

    public static int maximumDifference (int[] nums) {
        int n = nums.length;
        int ans = -1, premin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > premin) {
                ans = Math.max(ans, nums[i] - premin);
            } else {
                premin = nums[i];
            }
        }
        return ans;
    }
}
