package com.LeetCode;

public class _0008_字符串转换整数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("0-1"));
	}

	public static int myAtoi(String str) {
        char[] ch = str.toCharArray();
        int flag=0;//����λ
        int flagg=0;//��ֻ֤��һ������
        int flaggg=0;//�ո�λ
        int reasult=0;
        for(int i=0;i<ch.length;i++)
        {
        	
        	if(ch[i]=='-' && flagg==0)
        	{
        		flag=1;
        		flagg=1;
        		flaggg=1;
        	}
        	else if(ch[i]=='+' && flagg==0)
        	{
        		flag=0;
        		flagg=1;
        		flaggg=1;
        	}
        	else if(ch[i]<='9' && ch[i]>='0' )
        	{
        		flagg=1;
        		flaggg=1;
        		if(reasult > -214748364 && reasult < 214748364 )
        		{
        			reasult=reasult*10+(ch[i]-'0');
        		}
        		else {
        			if(reasult>Integer.MAX_VALUE/10){
            			if(flag==1)
            			{
            				return Integer.MIN_VALUE;
            			}
            			else {
            				return Integer.MAX_VALUE;
            			}
            		}
        			else {
                		reasult=reasult*10;
                	}
        			
        			//��Ϊ����λ�������㣬���Բ��ô����������
            		if(reasult>Integer.MAX_VALUE-(ch[i]-'0')){
            			if(flag==1)
            			{
            				return Integer.MIN_VALUE;
            			}
            			else {
            				return Integer.MAX_VALUE;
            			}
            		}else {
                		reasult=reasult+(ch[i]-'0');
                	}
        		}
        	}
        	else if(ch[i]==' ' && flaggg==0)
        	{
        		continue;
        	}
        	else {
        		break;
        	}
        }
        
        if(flag==0)
        	return reasult;
        else
        	return reasult*-1;
    }
}
