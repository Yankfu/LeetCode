package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/23 20:34
 */
public class _1332_删除回文子序列 {
    public int removePalindromeSub(String s) {
        if ("".equals(s)) {
            return 0;
        }
        if (s.equals(new StringBuilder(s).reverse().toString())) {
            return 1;
        }
        return 2;
    }
}
