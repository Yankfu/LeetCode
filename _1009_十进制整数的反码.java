package com.LeetCode;

public class _1009_十进制整数的反码 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bitwiseComplement(1));
	}

	public static int bitwiseComplement(int N) {
		if(N==0) {
			return 1;
		}
		StringBuilder sb = new StringBuilder();
		while (N != 0) {
			if ((N & 1) == 0) {
				sb.append("1");
			} else {
				sb.append("0");
			}
			N = N >>> 1;
		}
		sb = sb.reverse();
		int res = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '0') {
				res = res << 1;
			} else if (sb.charAt(i) == '1') {
				res = res << 1;
				res = res | 1;
			}
		}
		return (res);
	}
}
