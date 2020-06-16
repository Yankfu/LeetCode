package com.LeetCode;

import java.util.Stack;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/6/15 23:05
 */
public class _0844_比较含退格的字符串 {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        char[] chS = S.toCharArray();
        char[] chT = T.toCharArray();
        for (int i = 0; i < chS.length; i++) {
            if (chS[i] != '#'){
                stackS.push(chS[i]);
            }else {
                if (!stackS.isEmpty()){
                    stackS.pop();
                }else {

                }
            }
        }
        for (int i = 0; i < chT.length; i++) {
            if (chT[i] != '#'){
                stackT.push(chT[i]);
            }else {
                if (!stackT.isEmpty()){
                    stackT.pop();
                }else {

                }
            }
        }
        while (!stackS.isEmpty() && !stackT.isEmpty()){
            if (!stackS.pop().equals(stackT.pop())){
                return false;
            }
        }
        if (stackS.size()!=stackT.size()){
            return false;
        }
        return true;
    }
}
