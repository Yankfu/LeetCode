package com.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/20 18:34
 */
public class _1452_收藏清单 {
    //5414. 收藏清单
    /*
    取出A
    逐个比较
    如果发现b是a的子集比较下一个
    如果发现a是b的子集，进行下一轮比较
     */
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> res = new ArrayList<>();
        List<Set<String>> listSet = new ArrayList<>();
        for (int i = 0; i < favoriteCompanies.size(); i++) {
            Set<String> temp = new HashSet<>();
            temp.addAll(favoriteCompanies.get(i));
            listSet.add(temp);
        }
        for (int i = 0; i < listSet.size(); i++) {
            Set<String> set = listSet.get(i);
            boolean isTrue = false;
            for (int j = 0; j < listSet.size(); j++) {
                if (i == j){
                    continue;
                }
                if (listSet.get(j).containsAll(set)){
                    isTrue = true;
                    break;
                }
            }
            if (!isTrue){
                res.add(i);
            }
        }
        return res;
    }
}
