package com.LeetCode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _0542_01矩阵 {
    public static void main(String[] args) {

    }
    public static int[][] updateMatrix(int[][] matrix) {
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        int m = matrix.length,n = matrix[0].length;
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        //入队列
        Queue<int []> queue = new ArrayDeque<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    queue.offer(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }

        //搜索陆地“ 1 ”
        boolean hasLand = false;
        int[] point = null;
        while (!queue.isEmpty()){
            point = queue.poll();
            int x = point[0];
            int y = point[1];
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (newX<0||newX>=m||newY<0||newY>=n||matrix[newX][newY]!=1||visited[newX][newY]){
                    continue;
                }
                matrix[newX][newY] = matrix[x][y] + 1;
                visited[newX][newY] = true;
                queue.offer(new int[]{newX,newY});
            }
        }
        return matrix;
    }
}
