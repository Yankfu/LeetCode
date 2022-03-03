package no560To570;

import java.util.List;

public class FindTheClosestPalindrome_564 {

    public static String nearestPalindromic(String s) {
        int n = s.length();
        long cur = Long.parseLong(s);
        long num1 = (long) Math.pow(10, (n - 1)) - 1;
        long num2 = (long) Math.pow(10, n) + 1;
        long ans = -1;
        for (long i = num1; i <= num2; i++) {
            if (i == cur) {
                continue;
            }
            if (isPalindrom(i) && (Math.abs(i - cur) < Math.abs(ans - cur))) {
                ans = i;
            }
        }
        return String.valueOf(ans);
    }
    public static boolean isPalindrom(long n) {
        String str = Long.toString(n);
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
