package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/20 18:43
 */
public class _1446_连续字符 {
    public int maxPower(String s) {
        char[] ch = s.toCharArray();
        if(ch.length == 0){
            return 0;
        }
        int res = 1;
        int max = 0;
        for(int i = 1;i<ch.length;i++){
            if(ch[i] == ch[i-1]){
                res++;
            }else{
                if(res > max){
                    max = res;
                }
                res = 1;
            }
        }
        if(res>max){
            max = res;
        }
        return max;
    }
}
