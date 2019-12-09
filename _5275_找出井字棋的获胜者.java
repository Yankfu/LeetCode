package com.LeetCode;

public class _5275_找出井字棋的获胜者 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[][] moves= {{0,0},{1,1}};
		//int[][] moves = {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
		//int[][] moves = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
		int[][] moves = {};
		System.out.println(tictactoe(moves));
	}

	public static String tictactoe(int[][] moves) {
		int[][] qi=new int[3][3];
		if(moves.length<=4)
		{
			return "Pending";
		}
		for(int i=0;i<moves.length;i++)
		{
			if(i%2==0)
			{
				qi[moves[i][0]][moves[i][1]]=1;
			}
			else if(i%2==1)
			{
				qi[moves[i][0]][moves[i][1]]=2;
			}
		}
		
//		for(int i=0;i<qi.length;i++)
//		{
//			for(int j=0;j<qi[0].length;j++)
//			{
//				System.out.print(qi[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		if(qi[0][0]==1 && qi[0][1]==1 && qi[0][2]==1)
		{
			return "A";
		}
		else if(qi[1][0]==1 && qi[1][1]==1 && qi[1][2]==1)
		{
			return "A";
		}
		else if(qi[2][0]==1 && qi[2][1]==1 && qi[2][2]==1)
		{
			return "A";
		}
		else if(qi[0][0]==1 && qi[1][0]==1 && qi[2][0]==1)
		{
			return "A";
		}
		else if(qi[0][1]==1 && qi[1][1]==1 && qi[2][1]==1)
		{
			return "A";
		}
		else if(qi[0][2]==1 && qi[1][2]==1 && qi[2][2]==1)
		{
			return "A";
		}
		else if(qi[0][0]==1 && qi[1][1]==1 && qi[2][2]==1)
		{
			return "A";
		}
		else if(qi[2][0]==1 && qi[1][1]==1 && qi[0][2]==1)
		{
			return "A";
		}
		

		else if(qi[0][0]==2 && qi[0][1]==2 && qi[0][2]==2)
		{
			return "B";
		}
		else if(qi[1][0]==2 && qi[1][1]==2 && qi[1][2]==2)
		{
			return "B";
		}
		else if(qi[2][0]==2 && qi[2][1]==2 && qi[2][2]==2)
		{
			return "B";
		}
		else if(qi[0][0]==2 && qi[1][0]==2 && qi[2][0]==2)
		{
			return "B";
		}
		else if(qi[0][1]==2 && qi[1][1]==2 && qi[2][1]==2)
		{
			return "B";
		}
		else if(qi[0][2]==2 && qi[1][2]==2 && qi[2][2]==2)
		{
			return "B";
		}
		else if(qi[0][0]==2 && qi[1][1]==2 && qi[2][2]==2)
		{
			return "B";
		}
		else if(qi[2][0]==2 && qi[1][1]==2 && qi[0][2]==2)
		{
			return "B";
		}
		
		for(int i=0;i<qi.length;i++)
		{
			for(int j=0;j<qi[0].length;j++)
			{
				if(qi[i][j]==0)
				{
					return "Pending";
				}
			}
		}
		
//		for(int i=0;i<qi.length;i++)
//		{
//			for(int j=0;j<qi[0].length;j++)
//			{
//				System.out.print(qi[i][j]+" ");
//			}
//			System.out.println();
//		}
        return "Draw";
    }
}
