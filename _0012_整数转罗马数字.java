package com.LeetCode;

public class _0012_整数转罗马数字 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(intToRoman(1994));
		System.out.println("switch(num){");
		for(int i=1;i<=963;i++)
		{
			System.out.println("case "+(i-1)+":"+"return \""+intToRoman(i)+"\";");
		}
		System.out.println("}");
	}

	public static String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		while(1000<=num && num<=3999) {
			num = num - 1000;
			sb.append("M");
		}
		
		while(900<=num && num<=999) {
			num = num - 900;
			sb.append("CM");
		}
		
		while(500<=num && num<=8999) {
			num = num - 500;
			sb.append("D");
		}
		
		while(400<=num && num<=499) {
			num = num - 400;
			sb.append("CD");
		}
		
		while(100<=num && num<=399) {
			num = num - 100;
			sb.append("C");
		}
		
		while(90<=num && num<=99) {
			num = num - 90;
			sb.append("XC");
		}
		
		while(50<=num && num<=89) {
			num = num - 50;
			sb.append("L");
		}
		while(40<=num && num<=49) {
			num = num - 40;
			sb.append("XL");
		}
		while(10<=num && num<=39) {
			num = num - 10;
			sb.append("X");
		}
		
		if(num==9) {
			num = num - 9;
			sb.append("IX");
		}
		
		while(5<=num && num<=8) {
			num = num - 5;
			sb.append("V");
		}
		if(num == 4) {
			num = num - 4;
			sb.append("IV");
		}
		while(0<num && num<=3) {
			num = num - 1;
			sb.append("I");
		}
		
		return sb.toString();
    }
}
