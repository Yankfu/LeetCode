package com.LeetCode;

import java.util.Arrays;

public class _5172_形成三的最大倍数 {
    public static void main(String[] args) {
        int[] digits = {7,8,7,2,1,2,6,6,9,2};
        System.out.println(largestMultipleOfThree(digits));
    }
    public static String largestMultipleOfThree(int[] digits) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(digits);
        int[] temp = digits.clone();
        if(digits[digits.length-1] == 0){
            return "0";
        }
        int total = 0;
        boolean one = false;
        int two = 0;
        for(int a:digits){
            total += a;
        }
        if(total%3 == 0){
            for (int i = digits.length-1; i >= 0; i--) {
                sb.append(digits[i]);
            }
        }else if(total%3 == 1){
            for (int i = 0; i < digits.length; i++) {
                if(digits[i] == 1 || digits[i] == 4 || digits[i] == 7){
                    digits[i] = -1;
                    one = true;
                    break;
                }
            }
            if(one){
                for (int i = digits.length-1; i >= 0; i--) {
                    if(digits[i]!=-1){
                        sb.append(digits[i]);
                    }
                }
            } else if(!one){
                for (int i = 0; i < digits.length; i++) {
                    if(digits[i] == 2 || digits[i] == 5 || digits[i] == 8){
                        digits[i] = -1;
                        two++;
                        if(two == 2){
                            break;
                        }
                    }
                }
                for (int i = digits.length-1; i >= 0; i--) {
                    if(digits[i]!=-1){
                        sb.append(digits[i]);
                    }
                }
            }
        }else if(total%3 == 2){
            for (int i = 0; i < digits.length; i++) {
                if(temp[i] == 2 || temp[i] == 5 || temp[i] == 8){
                    temp[i] = -1;
                    one = true;
                    break;
                }
            }
            if(one){
                for (int i = digits.length-1; i >= 0; i--) {
                    if(temp[i]!=-1){
                        sb.append(temp[i]);
                    }
                }
            } else if(!one){
                for (int i = 0; i < digits.length; i++) {
                    if(digits[i] == 1 || digits[i] == 4 || digits[i] == 7){
                        digits[i] = -1;
                        two++;
                        if(two == 2){
                            break;
                        }
                    }
                }
                for (int i = digits.length-1; i >= 0; i--) {
                    if(digits[i]!=-1){
                        sb.append(digits[i]);
                    }
                }
            }
        }
        return sb.toString();
    }
}
