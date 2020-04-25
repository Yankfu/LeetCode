package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/25 11:14
 */
public class _1419_数青蛙 {
    public static void main(String[] args) {

    }
    public int minNumberOfFrogs(String croakOfFrogs) {
        int res = 0;
        int c,r,o,a,k;
        c = 0;
        r = 0;
        o = 0;
        a = 0;
        k = 0;
        char[] ch = croakOfFrogs.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'c'){
                if (k > 0){
                    k--;
                }else {
                    res++;
                }
                c++;
            }else if (ch[i] == 'r'){
                c--;
                r++;
            }else if (ch[i] == 'o'){
                r--;
                o++;
            }else if (ch[i] == 'a'){
                o--;
                a++;
            }else if (ch[i] == 'k'){
                a--;
                k++;
            }
            if (c<0||r<0||o<0||a<0){
                break;
            }
        }
        if (c!=0||r!=0||o!=0||a!=0){
            return -1;
        }
        return res;
    }
}
