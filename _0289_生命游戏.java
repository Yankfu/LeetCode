package com.LeetCode;

public class _0289_生命游戏 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = {
							{0,1,0},
							{0,0,1},
							{1,1,1},
							{0,0,0}
						};
		gameOfLife(board);
		for(int[] a:board) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
	public static void gameOfLife(int[][] board) {
		if (board.length == 0) {
			return;
		}
        int[][] temp = new int[board.length][board[0].length];
		for(int i=0;i<board.length;i++) {
        	for(int j=0;j<board[0].length;j++) {
        		int count = help(board,i,j);
        		if (count<2) {
        			temp[i][j] = 0;
				}else if (count == 2 ) {
        			temp[i][j] = board[i][j];
				}else if (count == 3) {
        			temp[i][j] = 1;
				}else {
        			temp[i][j] = 0;
				}
        	}
        }
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = temp[i][j];
			}
		}
    }
    public static int help(int[][] board,int x,int y){
		int[] dx = {-1,-1,-1,0,0,1,1,1};
		int[] dy = {-1,0,1,-1,1,-1,0,1};
		int res = 0;
		for (int i = 0; i < 8; i++) {
			int newX = x+dx[i];
			int newY = y+dy[i];
			if (newX == -1 || newX == board.length || newY == -1 || newY ==board[0].length){
				continue;
			}
			if (board[newX][newY] == 1) res++;
		}
		return res;
	}
}
