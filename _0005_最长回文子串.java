package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0005_最长回文子串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babad";
		System.out.println(new _0005_最长回文子串().longestPalindrome2(s));
	}

	public static String longestPalindrome(String s) {
		if(s == null || s.length()==0){
            return "";
        }
      
        int sLength = s.length();
        if(sLength == 1){
            return s;
        }
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

	public String longestPalindrome2(String s) {
		List<Character> list = new ArrayList<>();
		list.add('#');
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			list.add(ch[i]);
			list.add('#');
		}

		int[] count = new int[list.size()];
		char[] mar = new char[list.size()];

		for (int i = 0; i < mar.length; i++) {
			mar[i] = list.get(i);
		}
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < count.length; i++) {
			//定义左右边界
			int left = i-1;
			int right = i+1;
			//初始半径为1；
			count[i] = 1;
			//开始循环
			while (left>=0 && right < count.length){
				if (mar[left--] == mar[right++]){
					count[i]++;
				}else {
					break;
				}
			}
			if (count[i]>max){
				maxIndex = i;
				max = count[i];
			}
		}


//		for (int i = 0; i < mar.length; i++) {
//			System.out.print(mar[i]+" ");
//		}
//		System.out.println();
//		for (int i = 0; i < mar.length; i++) {
//			System.out.print(count[i]+" ");
//		}
//
//		System.out.println();
		StringBuilder sb = new StringBuilder();
		for (int i = maxIndex - max + 1; i < maxIndex + max - 1; i++) {
			if (mar[i]=='#'){
				continue;
			}else {
				sb.append(mar[i]);
			}
		}

		return sb.toString();
	}
}
