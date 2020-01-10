package com.LeetCode;

public class _0299_猜数字游戏 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String secret="00112233445566778899";
		String guess="16872590340158679432";
		System.out.println(getHint(secret,guess));
	}
	public static String getHint(String secret, String guess) {
        char[] ch1=secret.toCharArray();
        char[] ch2=guess.toCharArray();
        int[] temp=new int[11];
        int Bulls=0;
        int Cows=0;
        for(int i=0;i<ch1.length;i++) {
        	if(ch1[i]==ch2[i]) {
        		Bulls++;
        		ch1[i]=':';
        		ch2[i]=':';
        	}else {
        		temp[ch1[i]-'0']++;
        	}
        }
        for(int i=0;i<ch1.length;i++) {
        	if(temp[ch2[i]-'0']>0) {
        		temp[ch2[i]-'0']--;
        		Cows++;
        	}
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(Bulls));
        sb.append("A");
        sb.append(Integer.toString(Cows));
        sb.append("B");
		return sb.toString();
    }
}
