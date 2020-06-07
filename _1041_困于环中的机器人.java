package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/7 14:31
 */
public class _1041_困于环中的机器人 {
    public boolean isRobotBounded(String instructions) {
        char[] ch = instructions.toCharArray();
        int[] count = new int[4];//0,1,2,3分别代表北，西，南，东
        int temp = 0;
        //l+1，r-1；
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'G'){
                count[Math.abs(temp)%4]++;
            }else if (ch[i] == 'L'){
                temp++;
            }else if (ch[i] == 'R'){
                temp--;
            }
        }
        if (count[0] == count[2] && count[1] == count[3]){
            return true;
        }else {
            if (temp%4==0){
                return false;
            }else {
                return true;
            }
        }
    }
}
