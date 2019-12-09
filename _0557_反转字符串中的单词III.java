package com.LeetCode;

import java.util.Arrays;

public class _0557_反转字符串中的单词III{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" ";
		System.out.println(reverseWords(s));
	}

	/*
	 * ˫ָ��
	 * �ĸ�����
	 * һ��ָ�ʼ�ģ�һ��ָ�ո�ǰ�ģ�
	 */
	public static String reverseWords(String s) {
        char[] ch=s.toCharArray();
        char[] hc=new char[ch.length];
        int k=-1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				k++;
				int j=i-1;
				hc[i]=ch[i];
				while(k!=i)
				{
					hc[k]=ch[j];
					k++;
					j--;
				}
			}
			if(i==ch.length-1)
			{
				k++;
				int j=i;
				while(k!=ch.length)
				{
					hc[k]=ch[j];
					k++;
					j--;
				}
			}
		}
		String str= new String(hc);
		return str;
    }
}