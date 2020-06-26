package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/26 11:44
 */
public class _面试题_01_03_URL化 {
    public static void main(String[] args) {
        String S="ds sdfs afs sdfa dfssf asdf             ";
        int length = 27;
        System.out.println(replaceSpaces(S,length));
    }
    public static String replaceSpaces(String S, int length) {
        char[] ch = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (ch[i] == ' '){
                sb.append("%20");
            }else {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
