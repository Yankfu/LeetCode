package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0046_全排列 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = permute(nums);
        for(List li:res){
            System.out.println(li);
        }
    }
    static List<List<Integer>> res = new ArrayList();
    static List<Integer> li = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums) {
        int[] used = new int[nums.length];
        backTrack(nums, used, 0, li);
        return res;
    }
    public static void backTrack(int[] nums, int[] used, int now, List<Integer> li) {
        if (now == nums.length) {
//            for (int i : li) {
//                System.out.print(i + " ");
//            }
//            System.out.println("  aaaaaa  " + now);
            // Java 中可变对象是引用传递，因此需要将当前 path 里的值拷贝出来
            res.add(new ArrayList<>(li));
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if(used[i]!=1){
                    li.add(nums[i]);
                    used[i] = 1;
                    backTrack(nums, used, now+1, li);
                    used[i] = 0;
                    li.remove(li.size() - 1);
                }
            }
        }
    }
}
