package com.LeetCode;

import java.util.LinkedList;
import java.util.List;

public class _5167_查询无效交易 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=new LinkedList<String>();
		String[] transactions= {"alice,20,800,mtv","alice,50,100,beijing","alice,20,800,mc","alice,50,1200,mtv"};
		ls=invalidTransactions(transactions);
	}
	/*
	 * 先进行字符串切割，切割出有效部分之后进行比较；
	 * 然后对时间进行排序
	 * 取第一个名字，比较下一个跟他相同的名字，如果时间跟第一个时间差距不超过60s，把两个都加到ls里
	 * 如果时间大于60s，比较钱数，如果钱数大于1000，加到ls里
	 * 如果以上两个都符合，把temp的值替换成新比较的字符串，再循环比较下一个位置的数据
	 */
	public static List<String> invalidTransactions(String[] transactions) {
		List<String> ls=new LinkedList<String>();
		String[][] temp=new String[transactions.length][4];
		String[] a=new String[5];
		for(int i=0;i<transactions.length;i++)
		{
			String temp1=transactions[i];
			temp[i]=temp1.split(",");
		}
		
		for(int i=0;i<temp.length;i++)
		{
			for(int j=i+1;j<temp.length;j++)
			{
				int b = Integer.valueOf(temp[i][1]).intValue();
				int c = Integer.valueOf(temp[j][1]).intValue();
				if(b>c)
				{
					String[] temp_new=temp[i];
					temp[i]=temp[j];
					temp[j]=temp_new;
				}
			}
		}
		
		String[] temp_new=temp[5];
		for(int i=0;i<temp.length;i++)
		{
			if(true)
			{
				ls.add(temp[0]+","+temp[1]+","+temp[2]+","+temp[3]+",");//字符串合并
			}
		}
		
//		for(int i=0;i<temp.length;i++)
//		{
//			for(int j=0;j<temp[0].length;j++)
//			{
//				System.out.print(temp[i][j]+"  ");
//			}
//			System.out.println();
//		}
		
		return ls;
    }
}
