package com.LeetCode;

import java.util.Stack;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/12 16:53
 */
public class _0224_基本计算器 {
    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }

    /**
     * 如果是  2-1 + 2 寻找第一个数字和其匹配的运算符，然后再找下一个数字和它匹配的运算符。
     * 其实可以把非负整数前面的运算符当作是正负号，然后全都用加法运算。
     * 如果是  (1+(4+5+2)-3)+(6+8)  遇到括号
     *
     * 如果栈不为空且没碰到）就一直入栈
     * 如果栈为空就直接进行运算
     * 如果遇到右括号就出栈到遇到左括号
     *
     * 括号里的当成另外一个表达式，扔到递归里面计算。
     *
     * @param s
     * @return
     */
    public static int calculate(String s) {
        if (s == null|| s.length() == 0){
            return 0;
        }
        int res = 0;

        // 1 = +
        // -1 = -
        int sing = 1;
        s = s.replaceAll(" +","");
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])){
                for (int j = i; j < ch.length; j++) {
                    if (!Character.isDigit(ch[j])){
                        //System.out.println(sing + "  " + s.substring(i,j)+" 这里是直接加的数字");
                        res += sing*Integer.parseInt(s.substring(i,j));
                        i = j - 1;
                        break;
                    }else if (j == ch.length-1){
                        //System.out.println(sing + "  " + s.substring(i,j)+" 这里是直接加的数字");
                        res += sing*Integer.parseInt(s.substring(i));
                        i = j;
                        break;
                    }
                }
            }else if (ch[i] == '('){
                int count = 1;
                for (int j = i+1; j < ch.length; j++) {
                    if (ch[j] == '('){
                        count++;
                    }else if (ch[j] == ')'){
                        count--;
                        if (count == 0){
                            //System.out.println("i: "+i+" j: "+j+ " 符号 "+sing + "  " + s.substring(i+1,j) + " 这里是进入递归的" +sing*calculate(s.substring(i+1,j)));
                            res += sing*calculate(s.substring(i+1,j));
                            i = j;
                            break;
                        }
                    }
                }
            }else if (ch[i] == '+'){
                sing = 1;
            }else if (ch[i] == '-'){
                sing = -1;
            }
        }
        return res;
    }

}
