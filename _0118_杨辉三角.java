package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0118_杨辉三角 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> li = generate(33);
		for(List list:li) {
			System.out.println(list);
		}
	}
	public static List<List<Integer>> generate(int numRows) {
        int[][] row = new int[numRows][];
        for(int i=0;i<numRows;i++) {
        	row[i]=new int[i+1];
        }
        for(int i=0;i<numRows;i++) {
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
        for(int i=0;i<numRows;i++) {
        	ArrayList temp = new ArrayList();
        	for(int j=0;j<i+1;j++) {
        		temp.add(row[i][j]);
        	}
        	list.add(temp);
        }
		return list;
    }
}
