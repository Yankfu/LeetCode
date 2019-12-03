package com.LeetCode;

public class _test {

//	_test test=new _test();
//	public static void main(String[] args) {
//		System.out.println("666666666666");
//	}
//	private final class You{
//		You nvpengyou=new You();
//	}
	public static void main(String[] args) {
		//int[][] grid={{2,2,2},{2,1,2},{2,2,2}};
		int[][] grid= {{1,2},{0,4}};
		System.out.println(projectionArea(grid));
	}
	
	/*
	 *  ±º‰∏¥‘”∂»O(3n)
	 * 
	 */
	public static int projectionArea(int[][] grid) {
        int best=0;
        int reasult=0;
        for(int i=0;i<grid.length;i++)
        {
        	best=grid[i][0];
        	for(int j=0;j<grid.length;j++)
        	{
        		if(grid[i][j]>best)
        		{
        			best=grid[i][j];
        		}
        		else
        			continue;
        	}
        	reasult+=best;
        }
        int flag=0;
        for(int i=0;i<grid.length;i++)
        {
        	best=grid[0][i];
        	for(int j=0;j<grid.length;j++)
        	{
        		if(grid[j][i]==0)
        		{
        			flag++;
        		}
        		
        		if(grid[j][i]>best)
        		{
        			best=grid[j][i];
        		}
        		else
        			continue;
        	}
        	reasult+=best;
        }
        
		return reasult+grid.length*grid.length-flag;
    }
}

