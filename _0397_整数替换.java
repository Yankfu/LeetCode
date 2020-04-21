package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/21 19:43
 */
public class _0397_整数替换 {
    public static void main(String[] args) {

    }
    public int integerReplacement(int n) {
        int count = 0;
        while (n!=1){
            if ((n & 1) == 0){
                n = n>>>1;
                count++;
            }else {
                if ((n & 2) == 0){
                    n = n-1;
                    count++;
                }else {
                    if(n == 3){
                        //3的特殊性处理，原因如上
                        count+=2;
                        break;
                    }else {
                        n += 1;
                    }
                    count++;
                }
            }
        }
        return count;
    }
}
