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
	 * �Ƚ����ַ����и�и����Ч����֮����бȽϣ�
	 * Ȼ���ʱ���������
	 * ȡ��һ�����֣��Ƚ���һ��������ͬ�����֣����ʱ�����һ��ʱ���಻����60s�����������ӵ�ls��
	 * ���ʱ�����60s���Ƚ�Ǯ�������Ǯ������1000���ӵ�ls��
	 * ����������������ϣ���temp��ֵ�滻���±Ƚϵ��ַ�������ѭ���Ƚ���һ��λ�õ�����
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
				ls.add(temp[0]+","+temp[1]+","+temp[2]+","+temp[3]+",");//�ַ����ϲ�
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
