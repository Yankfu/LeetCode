package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0119_杨辉三角II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = getRow(1);
		System.out.println(li);
	}
	public static List<Integer> getRow(int rowIndex) {
		rowIndex++;
		int[][] row = new int[rowIndex][];
        for(int i=0;i<rowIndex;i++) {
        	row[i]=new int[i+1];
        }
        for(int i=0;i<rowIndex;i++) {
        	for(int j=0;j<i+1;j++) {
        		if(j==0 || j==i) {
        			row[i][j]=1;
        		}
        		else {
        			row[i][j]=row[i-1][j-1]+row[i-1][j];
        		}
        	}
        }
        ArrayList list = new ArrayList();
        for(int j=0;j<rowIndex;j++) 
        	list.add(row[rowIndex-1][j]);
		return list;
    }
}
