package com.LeetCode;

public class _1147_段式回文 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="ghiabcdefhelloadamhelloabcdefghi";
		System.out.println(longestDecomposition(text));
	}

	public static int longestDecomposition(String text) {
		int count=0;
		char[] ch=text.toCharArray();
		int j=ch.length-1;
		for(int i=0;i<ch.length/2; )
		{
			int temp=1;
			while(ch[i]!=ch[j])
			{
				j--;
				temp++;
			}
			if(ch[i]==ch[j])
			{
				for(int k=i;k<i+temp;i++)
				{
					if(ch[k]==ch[ch.length-k])
					{
						
					}
				}
			}
		}
				
		return count;
    }
}
