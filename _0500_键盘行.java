package com.LeetCode;

import java.util.*;

public class _0500_¼üÅÌÐÐ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words= {"Hello", "Alaska", "Dad", "Peace"};
		String[] right=findWords(words);
		for(String rig : right)
		{
			System.out.println(rig);
		}
	}

	public static String[] findWords(String[] words) {
		if(words==null)
		{
			return null;
		}
		List<String> ans = new ArrayList<>();
		for(int i=0;i<words.length;i++)
		{
			char[] ch=words[i].toCharArray();
			
			int[] result=new int[ch.length];
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]=='q' || ch[j]=='w' || ch[j]=='e' || ch[j]=='r' || ch[j]=='t' || ch[j]=='y' || ch[j]=='u' || ch[j]=='i' || ch[j]=='o' || ch[j]=='p' || ch[j]=='Q' || ch[j]=='W' || ch[j]=='E' || ch[j]=='R' || ch[j]=='T' || ch[j]=='Y' || ch[j]=='U' || ch[j]=='I' || ch[j]=='O' || ch[j]=='P')
				{
					result[j]=1;
				}
				else if(ch[j]=='a' || ch[j]=='s' || ch[j]=='d' || ch[j]=='f' || ch[j]=='g' || ch[j]=='h' || ch[j]=='j' || ch[j]=='k' || ch[j]=='l' || ch[j]=='A' || ch[j]=='S' || ch[j]=='D' || ch[j]=='F' || ch[j]=='G' || ch[j]=='H' || ch[j]=='J' || ch[j]=='K' || ch[j]=='L')
				{
					result[j]=2;
				}
				else if(ch[j]=='z' || ch[j]=='x' || ch[j]=='c' || ch[j]=='v' || ch[j]=='b' || ch[j]=='n' || ch[j]=='m' || ch[j]=='Z' || ch[j]=='X' || ch[j]=='C' || ch[j]=='V' || ch[j]=='B' || ch[j]=='N' || ch[j]=='M')
				{
					result[j]=3;
				}
			}
			int j=1;
			int flag=1;
			
			while(j<result.length)
			{
				if(result[j]!=result[j-1])
				{
					flag=0;
				}
				j++;
			}
			if (flag==1) {
				String str = new String(ch);
				ans.add(str);
			}
		}
		return ans.toArray(new String[ans.size()]);
        
    }
}
