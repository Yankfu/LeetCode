package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/17 23:21
 */
public class _0455_分发饼干 {
    public static void main(String[] args) {

    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int indexG = g.length-1;
        int indexS = s.length-1;
        while (indexG >=0 && indexS >= 0){
            if (g[indexG] <= s[indexS]) {
                indexG--;
                indexS--;
                res++;
            }else {
                indexG--;
            }
        }
        return res;
    }
}
