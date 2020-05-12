package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/5/12 23:21
 */
public class _1441_用栈操作构建数组 {
    //用栈操作构建数组
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int temp = 1;
        for (int i = 0; i < target.length; i++) {
            while (temp != target[i]){
                list.add("Push");
                list.add("Pop");
                temp++;
            }
            list.add("Push");
            temp++;
        }
        return list;
    }
}
