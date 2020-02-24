package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _0039_组合总和 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> li = combinationSum(candidates, 7);
        System.out.println(li);
    }

    static List<List<Integer>> res = new ArrayList();
    static List<Integer> li = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates, target, 0, Integer.MIN_VALUE, li);
        return res;
    }

    //原数组，目标值，现在和，之前的值（用来剪枝），返回
    public static void backTrack(int[] candidates, int target, int now, int pre, List<Integer> li) {
        //如果等于目标值添加，返回
        if (now == target) {
//            for (int i : li) {
//                System.out.print(i + " ");
//            }
//            System.out.println("  aaaaaa  " + now);
            // Java 中可变对象是引用传递，因此需要将当前 path 里的值拷贝出来
            res.add(new ArrayList<>(li));
            return;
        } else if (now > target) { //如果大于目标值直接返回
            return;
        } else { //进行下一层的判断及回溯
            for (int i = 0; i < candidates.length; i++) {
                if (pre <= candidates[i]) { //如果现值小于之前的认为已经添加过了，进行剪枝避免重复计算
                    li.add(candidates[i]); //添加到返回对象里
                    backTrack(candidates, target, now + candidates[i], candidates[i], li);
                    li.remove(li.size() - 1); //从返回对象里删除
                }
            }
        }
    }
}
