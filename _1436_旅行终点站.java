package com.LeetCode;

import java.util.*;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/11 15:51
 */
public class _1436_旅行终点站 {
    public String destCity(List<List<String>> paths) {
        Map<String,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < paths.size(); i++) {
            map.put(paths.get(i).get(0),paths.get(i).get(1));
            set.add(paths.get(i).get(0));
        }
        for(Map.Entry<String, String> a:map.entrySet()){
            if (!set.contains(a.getValue())){
                return a.getValue();
            }
        }
        return "";
    }
}
