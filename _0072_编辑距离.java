package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/6 11:31
 */
public class _0072_编辑距离 {
    public static void main(String[] args) {

    }
    public static int minDistance(String word1, String word2) {
        if (word1.length() * word2.length() == 0) {
            return word1.length()+word2.length();
        }
        int[][] count = new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i < count.length; i++) {
            count[i][0] = i;
        }
        for (int i = 0; i < count[0].length; i++) {
            count[0][i] = i;
        }
        for (int i = 1; i < count.length; i++) {
            for (int j = 1; j < count[0].length; j++) {
                int left = count[i-1][j]+1;
                int down = count[i][j-1]+1;
                int leftDown = count[i-1][j-1];
                if (word1.charAt(i-1) != word2.charAt(j-1)){
                    leftDown += 1;
                }
                count[i][j] = Math.min(left,Math.min(down,leftDown));
            }
        }
        return count[count.length-1][count[0].length-1];
    }
}
