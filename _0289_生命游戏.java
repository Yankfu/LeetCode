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
        for(int i=0;i<board.length;) {
        	for(int j=0;j<board[0].length;j++) {
        		if((i==0 && j==0) || (i==0 && j==board[0].length-1) || (i==board.length-1 && j==0) || (i==board.length-1 && j==board[0].length-1)) {
        			
        		}
        	}
        }
    }
}
