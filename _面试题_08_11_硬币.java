package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/23 22:51
 */
public class _面试题_08_11_硬币 {
    int [][]dp;
    int []values={1,5,10,25};
    /*
    dp[i][j]=dp[i-1][j]+dp[i][j-values[i]]
    */
    public int waysToChange(int n) {
        dp=new int[values.length+1][n+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }

        for(int i=1;i<=values.length;i++){
            for(int j=1;j<=n;j++){
                if(j<values[i-1]){
                    dp[i][j]=dp[i-1][j];
                }
                else
                    dp[i][j]=(dp[i-1][j]+dp[i][j-values[i-1]])%1000000007;
            }
        }
        return dp[values.length][n];
    }
}
