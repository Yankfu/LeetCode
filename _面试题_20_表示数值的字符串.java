package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/12 13:55
 */
public class _面试题_20_表示数值的字符串 {

    /**
     * 如果一个字符串能表示十进制数值，一定属于以下几种
     * 1 十进制 ^-|+?[1-9]\d*$
     *      这个是带正负号的十进制
     * 2 科学计数法（整数）  正负号 + 数字 + e/E + 数字
     * 3 浮点数  正负号{0，1} + 数字 + \. + 数字
     * 4 科学计数法（浮点数） 正负号 + 整数 + 小数点 + 科学计数法整数
     *
     * 正负号出现必须在最开始或者e之后一位
     * e的出现必须在没有小数点并且没有别的e出现
     * 小数点只能出现一次，并且在e的前面
     * 数字必须出现
     *
     * @param s 输入的字符串
     * @return
     */

    public boolean isNumber(String s) {
        if (s == null || s.length() == 0){
            return false;
        }
        char[] ch = s.trim().toCharArray();
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='0' && ch[i]<='9'){
                numSeen = true;
            } else if (ch[i] == 'e' || ch[i] == 'E') {
                if (eSeen || !numSeen){
                    return false;
                }
                eSeen = true;
                numSeen = false;
            } else if (ch[i] == '.'){
                if (dotSeen || eSeen){
                    return false;
                }
                dotSeen = true;
            } else if (ch[i] == '+' || ch[i] == '-') {
                if (i!=0 && ch[i-1]!='e' && ch[i-1] != 'E'){
                    return false;
                }
            }else {
                return false;
            }
        }
        return numSeen;
    }
}
