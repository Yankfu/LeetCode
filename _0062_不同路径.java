package com.LeetCode;

/**
 * @Author Yankfu
 * @Email yankfu@foxmail.com
 * @Date 2020/2/19 下午8:52
 * @Version 1.0
 */
public class _0062_不同路径 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(7,3));
    }
    public static int uniquePaths(int m, int n) {
        int[][] bord = new int[m][n];
        for(int i = m-1;i>=0;i--){
            for(int j = n-1;j>=0;j--){
                if(i == m-1 || j == n-1){
                    bord[i][j] = 1;
                }else{
                    bord[i][j] = bord[i][j+1] + bord[i+1][j];
                }
            }
        }
        return bord[0][0];
    }
}
