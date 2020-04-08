package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/8 9:13
 */
public class _面试题13_机器人的运动范围 {
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
        if(x < 0 || x > visited.length-1 || y < 0 || y > visited[0].length-1 || k < count(x,y) || visited[x][y]) return 0;
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
