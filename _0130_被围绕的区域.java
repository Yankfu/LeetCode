package com.LeetCode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _0130_被围绕的区域 {
    public static void main(String[] args) {
        char[][] board = {
//                {'X','X','X','X'},
//                {'X','O','O','X'},
//                {'X','X','O','X'},
                {'X','O','X','X'},
        };
        solve(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void solve(char[][] board) {
        if (board.length == 0) return ;
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        Queue<int []> queue = new ArrayDeque<>();
        //对每个边上的O广度优先搜索，然后遍历重写board
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O') queue.add(new int[]{i,0});
            if (board[i][board[0].length-1] == 'O') queue.add(new int[]{i,board[0].length-1});
        }
        for (int i = 1; i < board[0].length-1; i++) {
            if (board[0][i] == 'O') queue.add(new int[]{0,i});
            if (board[board.length-1][i] == 'O') queue.add(new int[]{board.length-1,i});
        }

        int[] point = null;
        while (!queue.isEmpty()){
            point = queue.poll();
            int x = point[0], y = point[1];
            board[x][y] = '-';
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (newX<0||newX>=board.length||newY<0||newY>=board[0].length||board[newX][newY]!='O'){
                    continue;
                }
                board[newX][newY] = '-';
                queue.offer(new int[]{newX,newY});
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }else if (board[i][j] == '-') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
