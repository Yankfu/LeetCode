package com.LeetCode;

public class _0415_字符串相加 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(addStrings("1234","123"));
	}
	public static String addStrings(String num1, String num2) {
        int nu1=num1.length()-1;
        int nu2=num2.length()-1;
        StringBuilder sb = new StringBuilder();
        int add=0;
		while(nu1>=0 || nu2>=0) {
			int n1 = nu1 >= 0 ? num1.charAt(nu1) - '0' : 0;
            int n2 = nu2 >= 0 ? num2.charAt(nu2) - '0' : 0;
            int tmp = n1 + n2 + add;
            add = tmp / 10;
            sb.append(tmp % 10);
            nu1--; nu2--;
        }
		if(add == 1)
			sb.append(1);
		return sb.reverse().toString();
    }
}
