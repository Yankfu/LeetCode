package com.LeetCode;

public class _0468_验证IP地址 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validIPAddress("172.16.254.1"));
	}

	public static String validIPAddress(String IP) {
		if(IP.matches("^((\\d|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5]))\\.){3}(\\d|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5]))$"))
			return "IPv4";
		else if(IP.matches("^(([\\da-fA-F]{1,4}):){7}[\\da-fA-F]{1,4}$"))
			return "IPv6";
		else
			return "Neither";
    }
}
