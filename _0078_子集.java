package com.LeetCode;

import java.util.*;

public class _0078_子集 {
    public static void main(String[] args) {
        int[] nums = {4,4,4,1,4};
        List<List<Integer>> li=subsets(nums);
        for(List list:li){
            System.out.println(list);
        }
    }
    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(nums,list,Integer.MIN_VALUE);
        Set set = new HashSet<>();
        set.addAll(res);
        List<List<Integer>> resNew = new ArrayList<>();
        resNew.addAll(set);
        return resNew;
    }
    public static void backTrack(int[] nums,List<Integer> li,int pre){
        res.add(new ArrayList<>(li));
        for(int i = 0;i<nums.length;i++){
            if(i>pre){
                li.add(nums[i]);
                backTrack(nums,li,i);
                li.remove(li.size()-1);
            }
        }
    }
}
