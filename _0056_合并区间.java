package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0056_合并区间 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1,3},{8,10},{2,6},{15,18}};
		int[][] res = merge(intervals);
		for(int[] a:res) {
			System.out.println(a[0]+" "+a[1]);
		}
	}
	public static int[][] merge(int[][] intervals) {
		int[][] res = intervals.clone();
		Arrays.sort(res);
		return res;
    }
//	public static int[][] merge(int[][] intervals) {
//		if(intervals.length==0) {
//			int[][] res= {};
//			return res;
//		}
//		//确定一维数组大小
//		int big=Integer.MIN_VALUE;
//		for(int i=0;i<intervals.length;i++) {
//			if(big<intervals[i][1]) {
//				big=intervals[i][1];
//			}
//		}
//		//生成一维数组
////		System.out.println("big: "+big);
//		int[] temp = new int[big+1];
//		//给一维数组赋值
//		for(int i=0;i<intervals.length;i++) {
//			for(int j=intervals[i][0];j<=intervals[i][1];j++) {
//				temp[j]=1;
//			}
//		}
//		List<Integer> li = new ArrayList<Integer>();
//		int first=0;
//		int last=0;
////		for(int a:temp) {
////			System.out.print(a+" ");
////		}
////		System.out.println();
//		for(int i=0;i<temp.length;i++) {
//			if(temp[i]==1) {
//				first=i;
//				last=first;
//				while(last<temp.length && temp[last]!=0) {
//					last++;
//				}
//				last--;
//				li.add(first);
//				li.add(last);
//				i=last;
//			}
//		}
//		int[][] res = new int[(li.size()+1)/2][2];
//		first=0;
//		for(int i=0;i<res.length;i++) {
//			res[i][0]=li.get(first++);
//			res[i][1]=li.get(first++);
//		}
//		return res;
//    }
}
