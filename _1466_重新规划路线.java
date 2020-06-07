package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/7 14:29
 */
public class _1466_重新规划路线 {
    //重新规划路线
    //BFS?
    //如果能到0就添加到能到集合里面，如果到不了就翻转一下再看能不能添加到能到集合里面
    public int minReorder(int n, int[][] connections) {
        int res = 0;
        Set<Integer> can = new HashSet<>();
        can.add(0);
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < connections.length; i++) {
                if (can.contains(connections[i][1])){
                    can.add(connections[i][0]);
                }else if (can.contains(connections[i][0])){
                    res++;
                    can.add(connections[i][1]);
                    //进行一次翻转
                    int temp = connections[i][0];
                    connections[i][0] = connections[i][1];
                    connections[i][1] = temp;
                }else{
                    flag = true;
                }
            }
        }
        return res;
    }
}
