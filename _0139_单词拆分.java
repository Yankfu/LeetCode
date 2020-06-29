package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/25 11:34
 */
public class _0139_单词拆分 {

    public static void main(String[] args) {
        List<String> wordDict = Arrays.asList("leet", "code");
        String s = "leetcode";
        wordBreak(s,wordDict);
    }

    /**
     * 动态规划
     * 虽然完全没搞懂如何进行动态规划，但是还是要搞一下的。
     * @param s
     * @param wordDict
     * @return
     */
    public static HashMap<String,Boolean> map = new HashMap<>();
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        for (String word :wordDict){
            map.put(word,true);
        }

        dp[0] = true;

        for (int j = 1;j <= s.length();j++){
            for (int i = j-1; i >= 0; i--) {
                dp[j] = dp[i] && check(s.substring(i,j));
                if (dp[j]){
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    public static boolean check(String s){
        return map.getOrDefault(s,false);
    }
}
