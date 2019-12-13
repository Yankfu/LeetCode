package com.LeetCode;

public class _0067_二进制求和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("1", "111"));
	}

	// 倒序检索，得二进一
	public static String addBinary(String a, String b) {
		int flag = 0;
		int temp_a = a.length() - 1;
		int temp_b = b.length() - 1;
		StringBuilder sb = new StringBuilder();
		while (temp_a >= 0 && temp_b >= 0) {
			if ((a.charAt(temp_a) == '0' && b.charAt(temp_b) == '0') && flag == 0) {
				sb.append('0');
				flag = 0;
				temp_a--;
				temp_b--;
			} else if (((a.charAt(temp_a) == '1' && b.charAt(temp_b) == '0')
					|| (a.charAt(temp_a) == '0' && b.charAt(temp_b) == '1')) && flag == 0) {
				sb.append('1');
				flag = 0;
				temp_a--;
				temp_b--;
			} else if ((a.charAt(temp_a) == '1' && b.charAt(temp_b) == '1') && flag == 0) {
				sb.append('0');
				flag = 1;
				temp_a--;
				temp_b--;
			} else if ((a.charAt(temp_a) == '0' && b.charAt(temp_b) == '0') && flag == 1) {
				sb.append('1');
				flag = 0;
				temp_a--;
				temp_b--;
			} else if (((a.charAt(temp_a) == '1' && b.charAt(temp_b) == '0')
					|| (a.charAt(temp_a) == '0' && b.charAt(temp_b) == '1')) && flag == 1) {
				sb.append('0');
				flag = 1;
				temp_a--;
				temp_b--;
			} else if ((a.charAt(temp_a) == '1' && b.charAt(temp_b) == '1') && flag == 1) {
				sb.append('1');
				flag = 1;
				temp_a--;
				temp_b--;
			}
		}
		if (temp_a >= 0) {
			while (temp_a >= 0) {
				if (a.charAt(temp_a) == '0' && flag == 0) {
					sb.append('0');
					flag = 0;
					temp_a--;
				} else if (a.charAt(temp_a) == '1' && flag == 0) {
					sb.append('1');
					flag = 0;
					temp_a--;
				} else if (a.charAt(temp_a) == '0' && flag == 1) {
					sb.append('1');
					flag = 0;
					temp_a--;
				} else if (a.charAt(temp_a) == '1' && flag == 1) {
					sb.append('0');
					flag = 1;
					temp_a--;
				}
			}
		}
		if (temp_b >= 0) {
			while (temp_b >= 0) {
				if (b.charAt(temp_b) == '0' && flag == 0) {
					sb.append('0');
					flag = 0;
					temp_b--;
				} else if (b.charAt(temp_b) == '1' && flag == 0) {
					sb.append('1');
					flag = 0;
					temp_b--;
				} else if (b.charAt(temp_b) == '0' && flag == 1) {
					sb.append('1');
					flag = 0;
					temp_b--;
				} else if (b.charAt(temp_b) == '1' && flag == 1) {
					sb.append('0');
					flag = 1;
					temp_b--;
				}
			}
		}
		if (flag == 1) {
			sb.append('1');
		}
		return sb.reverse().toString();
	}
}
