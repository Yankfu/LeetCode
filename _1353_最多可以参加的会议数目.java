package com.LeetCode;

import java.util.PriorityQueue;
import java.util.Queue;

public class _1353_最多可以参加的会议数目 {
    public static void main(String[] args) {
        int[][] events= {
            {1,4},
            {4,4},
            {2,2},
            {3,4},
            {1,1}
        };
        System.out.println(maxEvents(events));
    }
    public static int maxEvents(int[][] events) {
        int res = 0;
        sort(events);
        return res;
    }
    public static void sort(int[][] events){
        //先对第一个排序
        int[] temp = new int[2];
        for(int i =1;i<events.length;i++) {
            for(int j=0;j<events.length-i;j++) {
                if(events[j][0]>events[j+1][0]) {
                    temp[0] = events[j][0];
                    temp[1] = events[j][1];
                    events[j][0]=events[j+1][0];
                    events[j][1]=events[j+1][1];
                    events[j+1][0] = temp[0];
                    events[j+1][1] = temp[1];
                }
            }
        }
        int start = 0;
        int end = start+1;
        while(events[end][0] == events[start][0]){
            end++;
        }
    }
}
