package com.LeetCode;

import java.util.LinkedList;
import java.util.List;

public class _5167_查询无效交易 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		List<String> ls=new LinkedList<String>();
		String[] transactions= {"alice,20,800,mtv","alice,50,100,beijing","alice,20,800,mc","alice,50,1200,mtv"};
		ls=invalidTransactions(transactions);
	}

	public static List<String> invalidTransactions(String[] transactions) {
		List<String> ls=new LinkedList<String>();
		String[][] temp=new String[transactions.length][4];
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
		
		for(int i=0;i<temp.length;i++)
		{
			if(true)
			{
				ls.add(temp[0]+","+temp[1]+","+temp[2]+","+temp[3]+",");//�ַ����ϲ�
			}
		}
		
		
		return ls;
    }
}
