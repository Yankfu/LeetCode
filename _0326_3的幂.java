package com.LeetCode;

public class _0326_3的幂 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isPowerOfThree(int n) {
        switch (n) {
		case 1:return true;
		case 3:return true;
		case 9:return true;
		case 27:return true;
		case 81:return true;
		case 243:return true;
		case 729:return true;
		case 2187:return true;
		case 6561:return true;
		case 19683:return true;
		case 59049:return true;
		case 177147:return true;
		case 531441:return true;
		case 1594323:return true;
		case 4782969:return true;
		case 14348907:return true;
		case 43046721:return true;
		case 129140163:return true;
		case 387420489:return true;
		case 1162261467:return true;
		default: return false;
        }
    }
}
