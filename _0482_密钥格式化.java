package com.LeetCode;

public class _0482_密钥格式化 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "2-4A0r7-4k";
		System.out.println(licenseKeyFormatting(S, 4));
	}

	// 先toCharArray
	// 然后用指针，第一个破折号前不管，后面置计数器每k个添加一个破折号
//	public static String licenseKeyFormatting(String S, int K) {
//        char[] ch = S.toUpperCase().toCharArray();
//        boolean flag = false;
//        StringBuilder sb = new StringBuilder();
//        int count = 0;
//        for(int i=0;i<ch.length;i++) {
//        	if(ch[i]!='-' && !flag) {
//        		sb.append(ch[i]);
//        	}else if(ch[i]!='-' && flag) {
//        		count++;
//        		if(count == K+1) {
//        			sb.append('-');
//        			count = 0;
//        			sb.append(ch[i]);
//        		}else if(count < K+1) {
//        			sb.append(ch[i]);
//        		}
//        	}else if(ch[i]=='-' && !flag) {
//        		sb.append(ch[i]);
//        		flag = true;
//        	}else if(ch[i]=='-' && flag) {
//        		continue;
//        	}
//        }
//		return sb.toString();
//    }
	public static String licenseKeyFormatting(String S, int K) {
		StringBuilder sb = new StringBuilder();
		char[] ch = S.toUpperCase().toCharArray();
		int count=0;
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i] == '-') {
				continue;
			}else if(ch[i] != '-') {	
				//System.out.println(ch[i]+"   "+count);
        		if(count == K) {
        			sb.append('-');
        			count = 0;
        			sb.append(ch[i]);
        		}else if(count < K) {
        			sb.append(ch[i]);
        		}
        		count++;
			}
		}
		return sb.reverse().toString();
	}
}
