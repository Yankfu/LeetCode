package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/7/1 21:08
 */
public class _0718_最长重复子数组 {

    public static void main(String[] args) {
        int[] A = {1,2,3,2,1};
        int[] B = {3,2,1,7,4};
        System.out.println(findLength(A,B));
    }

    public static int findLength(int[] A, int[] B) {
        int[][] temp = new int[A.length][B.length];
        int big = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                //如果A == B
                if (A[i] == B[j]){
                    //先判断是否越界
                    if (i == 0 || j == 0){
                        temp[i][j] = 1;
                        big = Math.max(temp[i][j],big);
                    }else {
                        temp[i][j] = temp[i-1][j-1]+1;
                        big = Math.max(temp[i][j],big);
                    }
                }
            }
        }

//        for (int i = 0; i < temp.length; i++) {
//            for (int j = 0; j < temp[0].length; j++) {
//                System.out.print(temp[i][j]+" ");
//            }
//            System.out.println();
//        }

        return big;
    }
}
