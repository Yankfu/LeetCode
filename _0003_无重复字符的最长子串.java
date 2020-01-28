package com.LeetCode;

public class _0003_无重复字符的最长子串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime=System.currentTimeMillis();
		System.out.println(lengthOfLongestSubstring("abcdefgh"));
		//System.out.println(lengthOfLongestSubstring("abcabcbb"));
		long endTime=System.currentTimeMillis();
		System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ms");
	}	
/*
 * �ȼ��������1����Ϊ�������ͬ�Ļ�1�������
 * Ȼ��result����1�������ַ�������������ص���false������Ϊ�����result-1
 */
	public static int lengthOfLongestSubstring(String s) {
		int result=1;
		int start=0;
		int end=result;
		char[] a=s.toCharArray();
		int stringfalse=0;
		do{
			stringfalse=0;
			while(end <= a.length)
			{
				//System.out.println(s.substring(start,end)+"start:"+start+"end:"+end);
				if(isSubstring(s.substring(start,end)))
				{
//					start=0;
//					result++;
//					end=result;
//					stringfalse=0;
//					continue;
					start=0;
					result++;
					end=result;
					stringfalse=0;
					continue;
				}
				else
				{
					stringfalse++;
				}
				start++;
				end++;
			}
			//System.out.println("����stringfalse:"+stringfalse+"����result"+(result+1));
			start=0;
			result++;
			end=result;
		}while(stringfalse != (a.length-result+2));
		return result-2;
    }
	
	public static boolean isSubstring(String s)
	{
		//System.out.println("����isSubstring����ַ���s��"+s);
		char[] a=s.toCharArray();
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				//System.out.println("a[i]  "+a[i]+"  a[j]  "+a[j]);
				if(a[i]==a[j])
				{
					//System.out.println("false");
					return false;
				}
			}
		}
		//System.out.println("true");
		return true;
	}
}
