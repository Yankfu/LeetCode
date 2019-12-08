package com.LeetCode;

public class _0202_快乐数{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isHappy(19));
	}

	public static boolean isHappy(int n) {
        if (n == 1) return true;
        if((n == 4) || (n == 16) || (n == 37) || ( n == 58) || (n == 89) || (n == 145) || (n ==42) || (n == 20)) return false;
        int sum = 0;
        do {
            int remainder = n % 10;
            sum += remainder * remainder;
            n = n / 10;
        } while (n > 0);
        return isHappy(sum);
    }
}
