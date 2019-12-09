package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _5112_十六进制魔术数字 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toHexspeak("619879596177"));
	}

	public static String toHexspeak(String num) {
        long temp=Long.valueOf(num,10);
//        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
//    	if(temp == 0) return "0";
//    	String result = "";
//    	while(temp != 0){
//    	 	int x = temp&0xF;
//    	 	result = map[(x)] + result;
//    	 	temp = (temp >>> 4);
//    	}
        String result=Long.toHexString(temp);
        char[] temp1=result.toCharArray();
        List<Character> b = new ArrayList<Character>();
        for(char a:temp1)
        {
        	if(a=='1')
        	{
        		b.add('I');
        	}
        	else if(a=='0')
        	{
        		b.add('O');
        	}
        	else if('2'==a)
        	{
        		return "ERROR";
        	}
        	else if('3'==a)
        	{
        		return "ERROR";
        	}
        	else if('4'==a)
        	{
        		return "ERROR";
        	}
        	else if('5'==a)
        	{
        		return "ERROR";
        	}
        	else if('6'==a)
        	{
        		return "ERROR";
        	}
        	else if('7'==a)
        	{
        		return "ERROR";
        	}
        	else if('8'==a)
        	{
        		return "ERROR";
        	}
        	else if('9'==a)
        	{
        		return "ERROR";
        	}
        	else
        	{
        		b.add(Character.toUpperCase(a));
        	}
        }
        StringBuilder str = new StringBuilder();
        for (Character character : b) {
            str.append(character);
        }
		return str.toString();
    }
}
