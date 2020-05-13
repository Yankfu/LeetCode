package com.LeetCode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/13 17:57
 */
public class _0973_最接近原点的K个点 {
    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][];
        Queue<int[]> queue = new PriorityQueue<>(K,(a,b)->a[0]*a[0]+a[1]*a[1]-b[0]*b[0]-b[1]*b[1]);
        for (int[] point : points) {
            queue.add(point);
        }
        for (int i = 0; i < K; i++) {
            res[i] = queue.poll();
        }
        return res;
    }
}