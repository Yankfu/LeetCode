package com.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0216_组合总和III {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList();
        res = combinationSum3(3,9);
        System.out.println(res);
    }
    static List<List<Integer>> res = new ArrayList();
    static List<Integer> li = new ArrayList<>();
    public static  List<List<Integer>> combinationSum3(int k, int n) {
        int[] candidates = new int[9];
        for(int i= 0;i<9;i++){
            candidates[i] = i+1;
        }
        backTrack(candidates, n, 0, Integer.MIN_VALUE, li,k);
        //用哪个，那个变成-1传给下一个
        Set set = new HashSet();
        set.addAll(res);
        List<List<Integer>> resNew = new ArrayList();
        resNew.addAll(set);
        return resNew;
    }
    //原数组，目标值，现在和，之前的值（用来剪枝），返回
    public static void backTrack(int[] candidates, int target, int now, int pre, List<Integer> li,int k) {
        int temp = 0;
        //如果等于目标值添加，返回
        if (now == target && li.size() == k) {
            // Java 中可变对象是引用传递，因此需要将当前 path 里的值拷贝出来
            res.add(new ArrayList<>(li));
            return;
        } else if (now > target) { //如果大于目标值直接返回
            return;
        } else { //进行下一层的判断及回溯
            for (int i = 0; i < candidates.length; i++) {
                if (candidates[i]>0 && pre <= candidates[i]) { //如果现值小于之前的认为已经添加过了，进行剪枝避免重复计算
                    li.add(candidates[i]); //添加到返回对象里
                    temp = candidates[i];
                    candidates[i] = -1;
                    backTrack(candidates, target, now + temp, temp, li,k);
                    li.remove(li.size() - 1); //从返回对象里删除
                    candidates[i] = temp;
                }
            }
        }
    }
}
