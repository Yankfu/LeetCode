package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @PACKAGE_NAME：com.LeetCode
 * @DESCRIPTION:
 * @AUTHOR: Yankfu
 * @DATE: 2020/7/1 21:34
 */
public class _1282_用户分组 {

    public static void main(String[] args) {
        int[] groupSizes = {2,1,3,3,3,2};
        System.out.println(groupThePeople(groupSizes));
    }

    //最想做的就是Arrays.sort一下
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        int[] temp = groupSizes.clone();
        Arrays.sort(temp);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            int count = temp[i];
            List<Integer> tempList = new LinkedList<>();
            for (int j = 0; j < groupSizes.length && count > 0; j++) {
                if (groupSizes[j] == temp[i]){
                    tempList.add(j);
                    groupSizes[j] = -1;
                    count--;
                }
            }
            res.add(new ArrayList<>(tempList));
            //因为循环还需要加一，所以这里减一
            i = i + temp[i] - 1;
        }
        return res;
    }
}
