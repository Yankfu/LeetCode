package com.LeetCode;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/20 18:38
 */
public class _1450_在既定时间做作业的学生人数 {
    //5412. 在既定时间做作业的学生人数
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i]<=queryTime && endTime[i]>=queryTime){
                res++;
            }
        }
        return res;
    }
}
