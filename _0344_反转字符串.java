package com.LeetCode;

public class _0344_反转字符串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] s= {};
		reverseString(s);
	}
	/*
	 * ˫ָ�뷽����һ����ǰ����һ���Ӻ��ǰ����ָ����������С�Ĵ��ڴ�ĵ�ʱ�����ѭ����
	 */
	public static void reverseString(char[] s) {
        char temp;
        int i=0;
        int j=s.length-1;
        while(i!=j && i<j)
        {
        	temp=s[i];
        	s[i]=s[j];
        	s[j]=temp;
        	i++;
        	j--;
        }
        for(i=0;i<s.length;i++)
        {
        	System.out.print(s[i]);
        }
    }
}
