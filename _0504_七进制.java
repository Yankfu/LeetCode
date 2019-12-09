package com.LeetCode;

public class _0504_七进制{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToBase7(-5));
	}
	
	public static String convertToBase7(int num) {
		int temp=0;
		int chu=num;
		int result;
		int yu = 0;
		int i=1;
		if((chu/7)==0) {
			return String.valueOf(num);
		}
		else {
			while((chu/7)!=0){
				yu=chu%7;
				result=chu/7;
				chu=result;
				temp=temp+yu*i;
				i=i*10;
			}
			yu=chu%7;
			temp=temp+yu*i;
		}
		return String.valueOf(temp);
    }
}
