package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/17 15:15
 */
public class _1014_最佳观光组合 {

    public static void main(String[] args) {
        int[] A = {8,1,5,2,6};
        System.out.println(maxScoreSightseeingPair(A));
    }

    public static int maxScoreSightseeingPair(int[] A) {
        int res = 0;
        int max = A[0]+0;
        for (int i = 1; i < A.length; i++) {
            if (A[i]-i+max > res){
                res = A[i]-i+max;
            }
            if (A[i]+i > max){
                max = A[i]+i;
            }
        }

        return res;
    }
}
