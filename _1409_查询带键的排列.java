package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/19 21:26
 */
public class _1409_查询带键的排列 {
    //查询带键的排列
    public static int[] processQueries(int[] queries, int m) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            map.put(i + 1, i);
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = map.get(queries[i]);
            map.put(queries[i], 0);
            for (Integer tempInt : map.keySet()) {
                if (map.get(tempInt) < res[i] && tempInt != queries[i]) {
                    map.put(tempInt, map.get(tempInt) + 1);
                }
            }
//			for (Integer tempInt : map.keySet()){
//				System.out.print(tempInt+" "+map.get(tempInt)+"   ;  ");
//			}
        }
        return res;
    }
}
