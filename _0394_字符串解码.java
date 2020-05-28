package com.LeetCode;

import java.util.Iterator;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/28 8:40
 */
public class _0394_字符串解码 {
    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println(decodeString(s));
    }
    public static String decodeString(String s) {
        if (s.length() == 0){
            return "";
        }
        char[] ch = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]<='9' && ch[i]>='0'){
                //如果是数字，说明要进入循环，就先找到循环次数
                StringBuilder nums = new StringBuilder();
                while (ch[i]<='9' && ch[i]>='0'){
                    nums.append(ch[i]);
                    i++;
                }
                int num = Integer.parseInt(nums.toString());
                //i现在在左括号上
                //开始寻找方括号，然后将方括号里面的扔到递归。
                //如果再遇到左括号就把变量加以，遇到右括号变量减一，当遇到右括号且变量为0的时候递归。
                StringBuilder temp = new StringBuilder();
                int right = i+1;
                int count = 0;
                while (true){
                    if (ch[right] == ']' && count==0)
                        break;
                    if (ch[right] == '[')
                        count++;
                    if (ch[right] == ']')
                        count--;
                    right++;
                }
                i++;
                //建立字符串
                for ( ; i < right; i++) {
                    temp.append(ch[i]);
                }
                //i完事了就停在right上了，所以要再加一个

                String tempString = decodeString(temp.toString());

                //递归建立要返回的字符串
                for (int j = 0; j < num; j++) {
                    res.append(tempString);
                }

            }else {
                res.append(ch[i]);
            }
        }
        return res.toString();
    }
}
