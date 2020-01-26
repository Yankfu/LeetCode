package com.LeetCode;

public class _0043_字符串相乘 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "123";
		String b = "456";
		System.out.println(multiply(a,b));
	}
	public static String multiply(String num1, String num2) {
		char[] ch1=num1.toCharArray();
        char[] ch2=num2.toCharArray();
        int[][] temp = new int[ch2.length][ch1.length+1];//中间式
        int jin = 0;
        int a = 0;
        int b = 0;
        int numTemp = 0;
        for(int i=ch2.length-1;i>=0;i--) { //控制第一行
        	b=ch2[i]-'0';
        	jin=0;
        	for(int j=ch1.length-1;j>=0;j--) { //控制第二行
        		a=ch1[j]-'0';
        		//System.out.println(b+"  "+a);
        		numTemp = a * b;
        		temp[ch2.length-i-1][j+1] =(numTemp + jin)%10;
        		jin = (numTemp / 10)+(numTemp%10 + jin)/10;
        		//System.out.println(temp[i][j]+"  "+jin);
        	}
        	temp[ch2.length-i-1][0] = jin;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<temp.length;i++) {
        	for(int j=0;j<temp[0].length;j++) {
        		System.out.print(temp[i][j]+"  ");
        	}
        	System.out.println();
        }
        int j=temp[0].length-1;
        int k=0;
        int l=0;
        jin=0;
        while(j!=-1) {
           	l=j;
        	numTemp=0;
        	while(l<temp[0].length && k<temp.length) {
        		numTemp+=temp[k][l];
        		k++;
        		l++;
        	}
        	//System.out.println(numTemp+"aaaaaaa");
        	sb.append(Integer.toString((numTemp + jin)%10));
        	jin = (numTemp / 10)+(numTemp%10 + jin)/10;
        	j--;
        	k=0;
        }
        k=1;
        while(k!=temp.length) {
        	l=0;
        	j=k;
        	numTemp=0;
        	while(l<temp[0].length && j<temp.length) {
        		//System.out.println("j: "+j+" l: "+l+" res+ "+temp[j][l]);
        		numTemp+=temp[j][l];
        		j++;
        		l++;
        	}
        	//System.out.println(numTemp+"aaaaaaa");
        	sb.append(Integer.toString((numTemp + jin)%10));
        	jin = (numTemp / 10)+(numTemp%10 + jin)/10;
        	k++;
        }
        while(sb.charAt(sb.length() - 1)=='0' && sb.length()>1) {
        	sb=sb.deleteCharAt(sb.length() - 1);
        }
		return sb.reverse().toString();
    }
}
