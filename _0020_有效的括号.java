package com.LeetCode;

public class _0020_ÓÐÐ§µÄÀ¨ºÅ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="{{)}";
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s) {
        char[] a = s.toCharArray();
        if(a.length==0)
        {
        	return true;
        }
        else if(a.length%2!=0)
        {
        	return false;
        }
        else
        {
        	int temp=0;
            for(int i=0;i<a.length-1;i++)
            {
                if(a[i]=='(' && (a[i+1] == ')' || a[i+1] == '{' || a[i+1] == '[' || a[i+1] == '('))
                {
                    temp+=1;
                }
                else if(a[i]==')')
                {
                    temp+=-1;
                }
                else if(a[i]=='[' && (a[i+1] == ']' || a[i+1] == '{' || a[i+1] == '[' || a[i+1] == '('))
                {
                    temp+=2;
                }
                else if(a[i]==']')
                {
                    temp+=-2;
                }
                else if(a[i]=='{' && (a[i+1] == '}' || a[i+1] == '{' || a[i+1] == '[' || a[i+1] == '('))
                {
                    temp+=3;
                }
                else if(a[i]=='}')
                {
                    temp+=-3;
                }
                else return false;
            }
            switch(a[a.length-1])
            {
                case '[':temp += 2; break;
                case ']':temp += -2; break;
                case '{':temp += 3; break;
                case '}':temp += -3; break;
                case '(':temp += 1; break;
                case ')':temp += -1; break;
            }
            if(temp==0)
            {
                return true;
            }
            else
                return false;
        }
    }
}
