package com.LeetCode;

public class _0507_完美数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPerfectNumber(0));
	}
	public static boolean checkPerfectNumber(int num) {
        int sum=0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        sum=sum-num;
		if(sum==num) {
			return true;
		}else {
			return false;
		}
    }
}
