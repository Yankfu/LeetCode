package com.LeetCode;

public class _860_柠檬水找零 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bills = { 5, 5, 5, 10, 20 };
		System.out.println(lemonadeChange(bills));
	}

	public static boolean lemonadeChange(int[] bills) {
		if (bills.length == 0) {
			return true;
		}
		if (bills.length == 1) {
			if (bills[0] == 5) {
				return true;
			} else {
				return false;
			}
		}
		int[] charge = new int[3];
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				charge[0]++;
			} else if (bills[i] == 10) {
				if (charge[0] <= 0) {
					return false;
				} else {
					charge[1]++;
					charge[0]--;
				}
			} else if (bills[i] == 20) {
				if (charge[1] > 0 && charge[0] > 0) {
					charge[1]--;
					charge[0]--;
				} else if (charge[1] == 0 && charge[0] > 2) {
					charge[0] = charge[0] - 3;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
