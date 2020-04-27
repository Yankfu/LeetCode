package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: 2020_春
 * @DESCRIPTION:
 * @USER: Yankfu
 * @DATE: 2020/4/27 22:41
 */
public class _1018_可被5整除的二进制前缀 {
    public static void main(String[] args) {

    }
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<Boolean>();
        int sum = 0;
        for(int i = 0;i<A.length;i++) {
            sum+=A[i];
            sum = sum>9?sum-10:sum;
            if(sum==0||sum==5) {
                list.add(true);
            }else list.add(false);
            sum = sum*2;
        }
        return list;
    }
}
