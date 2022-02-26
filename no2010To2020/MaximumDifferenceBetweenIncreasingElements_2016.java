package no2010To2020;

public class MaximumDifferenceBetweenIncreasingElements_2016 {

    public static void main (String[] args) {
        int[] nums = {7,1,5,4};
        System.out.println(maximumDifference(nums));
    }

    public static int maximumDifference (int[] nums) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            int nums1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int nums2 = nums[j];
                if (nums1 < nums2) {
                    res = Math.max(res, nums2 - nums1);
                }
            }
        }
        return res;
    }
}
