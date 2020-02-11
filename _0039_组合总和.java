package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0039_组合总和 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> li = combinationSum(candidates, 7);
        System.out.print(li);
    }

    static List<List<Integer>> res = new ArrayList();
    static List<Integer> li = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates, target, 0,Integer.MIN_VALUE, li);
        return res;
    }

    public static void backTrack(int[] candidates, int target, int now,int pre, List<Integer> li) {
        if (now == target) {
//            for (int i : li) {
//                System.out.print(i + " ");
//            }
//            System.out.println("  aaaaaa  " + now);
            // Java 中可变对象是引用传递，因此需要将当前 path 里的值拷贝出来
            res.add(new ArrayList<>(li));
            return;
        } else if (now > target) {
            return;
        } else {
            for (int i = 0; i < candidates.length; i++) {
                if(pre<=candidates[i]){
                    li.add(candidates[i]);
                    backTrack(candidates, target, now + candidates[i],candidates[i], li);
                    li.remove(li.size() - 1);
                }
            }
        }
    }
}
