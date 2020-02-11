package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0060_第k个排列 {
    public static void main(String[] args) {
        System.out.println(getPermutation(4,9));
    }
    public static String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = i+1;
        }
        List<List<Integer>> res = permute(nums);
        List<Integer> li = res.get(k-1);
        StringBuilder sb = new StringBuilder();
        for(Integer i:li){
            sb.append(i);
        }
        return sb.toString();
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
