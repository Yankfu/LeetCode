package com.LeetCode;

public class _0005_最长回文子串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome(""));
	}

	public static String longestPalindrome(String s) {
		if(s == null || s.length()==0){
            return "";
        }
      
        int sLength = s.length();
        if(sLength == 1){
            return s;
        }
        String s_new = new String();
        int j=0;
        char[] ch = new char[(s.length()*2+1)];
        //System.out.println((s.length()*2+1));
        for(int i=0;i<ch.length;i++) {
        	if((i&1) == 1) {
        		//奇数
        		ch[i] = s.charAt(j);
        		//System.out.println(s.charAt(j));
        		j++;
        	}
        	else {
        		ch[i] = '#';
        	}
        }
        j=0;
        int best=0;
        int best_dizhi=0;
        int[] temp = new int[ch.length];
        while( j<ch.length ) {
        	temp[j] = banjing(ch,j);
        	if(temp[j]>best) {
        		best=temp[j];
        		best_dizhi=j;
        	}
        	j++;
        }
        //System.out.println("temp[j]: "+temp[best_dizhi]+" j: "+best_dizhi);
//        StringBuilder sb = new StringBuilder();
//        for(int i=best_dizhi-best+1;i<best_dizhi+best-1;i++) {
//        	if(ch[i]!='#') {
//        		sb.append(ch[i]);
//        	}
//        }
		return s.substring((best_dizhi-best/2-1)/2, (best_dizhi+best/2+2)/2);
    }
	public static int banjing(char[] ch,int i) {
		int temp=0;
		int high=i;
		int low=i;
		while((low>=0) && (high<ch.length)) {
			//System.out.println("high:  "+high+"low:  "+low+"ch[high]:  "+ch[high]+"ch[low]:  "+ch[low]);
			if(ch[low] == ch[high]) {
				low--;
				high++;
				temp++;
			}else {
				break;
			}
		}
		return temp;
	}
	
}
