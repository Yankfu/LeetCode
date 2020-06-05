package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * 面试题13. 机器人的运动范围
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？

 * 示例 1：
 *
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 * 示例 1：
 *
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 * 提示：
 *
 * 1 <= n,m <= 100
 * 0 <= k <= 20
 * @USER: Yankfu
 * @DATE: 2020/4/8 9:13
 */
public class _面试题_13_机器人的运动范围 {
    public static void main(String[] args) {
        System.out.println(movingCount(3,1,0));
    }
    public static int movingCount(int m, int n, int k) {
        int res = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp = 0;
                if (!visited[i][j]) {
                    temp = help(visited,i,j,k);
                }
                if (temp > res){
                    res = temp;
                }
            }
        }
        return res;
    }
    public static int help(boolean[][] visited,int x,int y,int k){
        if(x < 0 || x > visited.length-1 || y < 0 || y > visited[0].length-1 || k < count(x,y) || visited[x][y]) {
            return 0;
        }
        visited[x][y] = true;
        return 1+help(visited,x+1,y,k)+help(visited,x,y+1,k);
    }
    public static int count(int x, int y){
        int res = 0;
        while(x>0) {
            res += x%10;
            x = x/10;
        }
        while(y>0) {
            res += y%10;
            y = y/10;
        }
        return res;
    }

}
