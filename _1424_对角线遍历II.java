package com.LeetCode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/6/8 22:42
 */
public class _1424_对角线遍历II {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer,List<Integer>> map = new LinkedHashMap<>();
        int lenght = 0;
        for (int i = 0; i < nums.size(); i++) {
            lenght += nums.get(i).size();
            for (int j = 0; j < nums.get(i).size(); j++) {
                List<Integer> orDefault = map.getOrDefault(i+j,new ArrayList<>());
                orDefault.add(nums.get(i).get(j));
                map.putIfAbsent(i+j,orDefault);
            }
        }

        int[] res = new int[lenght];

        int index = 0;
        for (int key:map.keySet()){
            List<Integer> list = map.get(key);
            for (int j = list.size(); j >= 0 ; j--) {
                res[index++] = list.get(j);
            }
        }

        return res;
    }
}
