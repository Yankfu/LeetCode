package com.LeetCode;

public class _0125_验证回文串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("0P"));
	}
	public static boolean isPalindrome(String s) {
        int low=0;
        int high=s.length()-1;
        char[] ch = s.toUpperCase().toCharArray();
        boolean flagLow=false;
        boolean flagHigh=false;
        while(low<high) {
        	//System.out.println("low: "+ch[low]+" high: "+ch[high]);
        	if((ch[low]<='Z' && ch[low]>='A') || (ch[low]<='9' && ch[low]>='0')) {
        		flagLow=true;
        	}
        	if((ch[high]<='Z' && ch[high]>='A')||(ch[high]<='9' && ch[high]>='0')) {
        		flagHigh=true;
        	}
        	if(flagLow && flagHigh) {
        		//System.out.println("1low: "+ch[low]+" high: "+ch[high]);
        		if(ch[low]!=ch[high]) {
        			return false;
        		}else {
        			flagLow=false;
        			flagHigh=false;
        			low++;
        			high--;
        		}
        	}else if(flagLow && !flagHigh){
        		high--;
        	}else if(!flagLow && flagHigh) {
        		low++;
        	}else if(!flagLow && !flagHigh) {
        		low++;
        		high--;
        	}
        }
		return true;
    }
}
