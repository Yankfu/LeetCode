package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/2 10:29
 */
public class _LCP_11_期望个数统计 {
    public static void main(String[] args) {

    }
    public int expectNumber(int[] scores) {
        Set<Integer> set = new HashSet<>();
        for (int x : scores){
            set.add(x);
        }
        return set.size();
    }
}
