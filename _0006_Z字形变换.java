package com.LeetCode;

import java.util.ArrayList;

public class _0006_Z字形变换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "LCIRETOESIIGEDHN";
		String s1= "L I E O S I E H";
		String s2= " C R T E I G D N";
		int numRows = 2;
		System.out.println(convert(s, numRows));
	}
/*
 * L(0)(6*0+0)     				D(0)(6*1+0)     			R(0)(6*2+0)		j=0;j<duan;j++  内层循环
 * E(1)(6*0+1)   O(5)(6*0+5)  	E(1)(6*1+1)   I(5)(6*1+5) 	I(1)(6*2+1)		i=0  while(i<duanchang)  外层循环
 * E(2)(6*0+2) C(4)(6*0+4)    	I(2)(6*1+2) H(4)(6*1+4)   	N(2)(6*2+2)		(duanchang*j+i)
 * T(3)(6*0+3)     				S(3)(6*1+3)     			G(3)(6*2+3)
 */
	public static String convert(String s, int numRows) {
		if(s.length()==0) {
			return null;
		}
		if(numRows == 1) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		//System.out.println(s.length());
		//记得考虑特殊情况
		int duan = (s.length())/(numRows+numRows-2);
		int duanchang = numRows+numRows-2;
		
		if((s.length())%(numRows+numRows-2)==0)
		{
			
		}
		else {
			duan++;
		}
		
		int k=0;
		
		int i=0;
		while(i<duanchang/2+1) { //控制要加的位置 第几段段*段长+位置
			for(int j=0;j<duan;j++){
				if(duanchang*j+i < s.length()) {
					if( (duanchang - i != i) && (i != 0) ) {
						sb.append(s.charAt(duanchang*j+i));
						System.out.println(s.charAt(duanchang*j+i)+"  j:"+j+"  i:"+i);
						if(duanchang*j+(duanchang-i) < s.length()) {
							sb.append(s.charAt(duanchang*j+(duanchang-i)));
							System.out.println(s.charAt(duanchang*j+(duanchang-i))+"  j:"+j+"  (duanchang-i):"+(duanchang-i));
						}
					}
					else {
						sb.append(s.charAt(duanchang*j+i));
						System.out.println(s.charAt(duanchang*j+i)+"  j:"+j+"  i:"+i);
					}
				}
			}
			i++;
		}
		return sb.toString();
	}
}
