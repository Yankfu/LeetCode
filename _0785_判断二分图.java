package com.LeetCode;

import java.util.Arrays;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/7/16 22:17
 */
public class _0785_判断二分图 {
    private static final int UNCOLORED = 0;
    private static final int RED = 1;
    private static final int GREEN = 2;
    private int[] color;
    private boolean valid;

    public boolean isBipartite(int[][] graph){
        int n = graph.length;
        valid = true;
        color = new int[n];
        Arrays.fill(color,UNCOLORED);
        for (int i = 0; i < n && valid; i++) {
            if (color[i] == UNCOLORED){
                dfs(i,RED,graph);
            }
        }
        return valid;
    }

    public void dfs(int node,int c,int[][] graph){
        color[node] = c;
        int cNei = c == RED?GREEN:RED;
        for (int i : graph[node]) {
            if (color[i] == UNCOLORED){
                dfs(i,cNei,graph);
                if (!valid){
                    return;
                }
            }else if (color[i] != cNei){
                valid = false;
                return;
            }
        }
    }

}
