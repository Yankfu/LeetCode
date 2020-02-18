package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _1291_顺次数 {
    public static void main(String[] args) {
        List<Integer> res = sequentialDigits(1000,13000);
        System.out.println(res);
    }
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        int[] FUCK = {
                12, 23, 34, 45, 56, 67, 78, 89,
                123, 234, 345, 456, 567, 678, 789,
                1234, 2345, 3456, 4567, 5678, 6789,
                12345, 23456, 34567, 45678, 56789,
                123456, 234567, 345678, 456789,
                1234567, 2345678, 3456789,
                12345678, 23456789,
                123456789
        };
        for(int a:FUCK){
            if(low<=a && a<=high)
                res.add(a);
        }
        return res;
    }
}
