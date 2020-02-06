package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class _0287_寻找重复数 {
    public static void main(String[] args) {

    }
    //只读，不能修改，不能sort
    public static int findDuplicate(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int a:nums){
            if(set.contains(a)){
                return a;
            }else {
                set.add(a);
            }
        }
        return res;
    }
}
